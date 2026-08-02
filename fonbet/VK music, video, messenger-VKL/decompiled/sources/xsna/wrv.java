package xsna;

import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.StandardCharsets;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: IcyDecoder.java */
/* loaded from: classes12.dex */
public final class wrv extends b920 {
    public static final Pattern e = Pattern.compile("(.+?)='(.*?)';", 32);
    public final CharsetDecoder c = StandardCharsets.UTF_8.newDecoder();
    public final CharsetDecoder d = StandardCharsets.ISO_8859_1.newDecoder();

    @Override // xsna.b920
    public final fi20 k(qi20 qi20Var, ByteBuffer byteBuffer) {
        String str;
        CharsetDecoder charsetDecoder = this.d;
        CharsetDecoder charsetDecoder2 = this.c;
        String str2 = null;
        try {
            str = charsetDecoder2.decode(byteBuffer).toString();
        } catch (CharacterCodingException unused) {
            try {
                String charBuffer = charsetDecoder.decode(byteBuffer).toString();
                charsetDecoder.reset();
                byteBuffer.rewind();
                str = charBuffer;
            } catch (CharacterCodingException unused2) {
                charsetDecoder.reset();
                byteBuffer.rewind();
                str = null;
            } catch (Throwable th) {
                charsetDecoder.reset();
                byteBuffer.rewind();
                throw th;
            }
        } finally {
            charsetDecoder2.reset();
            byteBuffer.rewind();
        }
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        if (str == null) {
            return new fi20(new yrv(bArr, null, null));
        }
        Matcher matcher = e.matcher(str);
        String str3 = null;
        for (int i = 0; matcher.find(i); i = matcher.end()) {
            String group = matcher.group(1);
            String group2 = matcher.group(2);
            if (group != null) {
                String u = o19.u(group);
                u.getClass();
                if (u.equals("streamurl")) {
                    str3 = group2;
                } else if (u.equals("streamtitle")) {
                    str2 = group2;
                }
            }
        }
        return new fi20(new yrv(bArr, str2, str3));
    }
}
