package xsna;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import com.vk.core.exceptions.FileFormatException;
import java.io.FileNotFoundException;
import java.io.IOException;

/* compiled from: FileVideoUtils.java */
/* loaded from: classes17.dex */
public final class gbr {

    /* compiled from: FileVideoUtils.java */
    public static class a {
        public int a;
        public int b;
        public String c;
        public long d;
        public int e;
        public int f;
        public int g;

        public final String toString() {
            StringBuilder sb = new StringBuilder("AnalyzeResult{width=");
            sb.append(this.a);
            sb.append(", height=");
            sb.append(this.b);
            sb.append(", mimeType='");
            sb.append(this.c);
            sb.append("', fileSize=");
            sb.append(this.d);
            sb.append(", duration=");
            return vu5.b(sb, this.e, '}');
        }
    }

    public static a a(Context context, Uri uri) throws IOException {
        return b(context, uri, true);
    }

    /*  JADX ERROR: Types fix failed
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:183)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:242)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:221)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
        */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x0080: MOVE (r4 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]) (LINE:129), block:B:94:0x0080 */
    public static xsna.gbr.a b(android.content.Context r10, android.net.Uri r11, boolean r12) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 407
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xsna.gbr.b(android.content.Context, android.net.Uri, boolean):xsna.gbr$a");
    }

    public static Long c(Context context, Uri uri) throws IOException {
        AssetFileDescriptor assetFileDescriptor = null;
        try {
            AssetFileDescriptor openAssetFileDescriptor = context.getContentResolver().openAssetFileDescriptor(uri, "r");
            if (openAssetFileDescriptor == null) {
                throw new FileNotFoundException("Cannot open uri: " + uri);
            }
            if (openAssetFileDescriptor.getLength() == -1 || openAssetFileDescriptor.getLength() < 0) {
                throw new FileFormatException("Incorrect fileSize: " + openAssetFileDescriptor.getLength());
            }
            Long valueOf = Long.valueOf(openAssetFileDescriptor.getLength());
            try {
                openAssetFileDescriptor.close();
            } catch (Exception unused) {
            }
            return valueOf;
        } catch (Throwable th) {
            if (0 != 0) {
                try {
                    assetFileDescriptor.close();
                } catch (Exception unused2) {
                }
            }
            throw th;
        }
    }
}
