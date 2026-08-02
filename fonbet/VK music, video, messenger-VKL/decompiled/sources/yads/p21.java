package yads;

import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes10.dex */
public final class p21 extends h03 {
    public static final Pattern c = Pattern.compile("(.+?)='(.*?)';", 32);
    public final CharsetDecoder a = bu.c.newDecoder();
    public final CharsetDecoder b = bu.b.newDecoder();

    @Override // yads.h03
    public final ut1 a(xt1 xt1Var, ByteBuffer byteBuffer) {
        String str;
        String str2 = null;
        try {
            str = this.a.decode(byteBuffer).toString();
        } catch (CharacterCodingException unused) {
            try {
                str = this.b.decode(byteBuffer).toString();
                this.b.reset();
                byteBuffer.rewind();
            } catch (CharacterCodingException unused2) {
                this.b.reset();
                byteBuffer.rewind();
                str = null;
            } catch (Throwable th) {
                this.b.reset();
                byteBuffer.rewind();
                throw th;
            }
        } finally {
            this.a.reset();
            byteBuffer.rewind();
        }
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        if (str == null) {
            return new ut1(new t21(bArr, null, null));
        }
        Matcher matcher = c.matcher(str);
        String str3 = null;
        for (int i = 0; matcher.find(i); i = matcher.end()) {
            String group = matcher.group(1);
            String group2 = matcher.group(2);
            if (group != null) {
                String a = ki.a(group);
                a.getClass();
                if (a.equals("streamurl")) {
                    str3 = group2;
                } else if (a.equals("streamtitle")) {
                    str2 = group2;
                }
            }
        }
        return new ut1(new t21(bArr, str2, str3));
    }
}
