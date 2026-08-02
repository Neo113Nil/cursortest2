package xsna;

import android.media.MediaCodecInfo;
import com.vk.media.pipeline.model.stat.TranscodeType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.Result;

/* compiled from: TranscodeStatBuilder.kt */
/* loaded from: classes3.dex */
public final class ejp0 {
    public long a;
    public long b;
    public long c;
    public long d;
    public long e;
    public long f;
    public gr10 g;
    public ArrayList h;
    public uy1 i;
    public TranscodeType j = TranscodeType.NONE;
    public final LinkedHashSet k = new LinkedHashSet();
    public Object l;
    public String m;
    public String n;
    public String o;
    public String p;

    public static boolean b(gq10 gq10Var, String str) {
        Object failure;
        try {
            ArrayList u0 = j5g.u0(gq10.c("video/hevc"), gq10.c("video/avc"));
            boolean z = false;
            if (!u0.isEmpty()) {
                Iterator it = u0.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (((MediaCodecInfo.CodecCapabilities) it.next()).isFeatureSupported(str)) {
                        z = true;
                        break;
                    }
                }
            }
            failure = Boolean.valueOf(z);
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Object obj = Boolean.FALSE;
        if (failure instanceof Result.Failure) {
            failure = obj;
        }
        return ((Boolean) failure).booleanValue();
    }

    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException
        */
    public final xsna.jrk0 a(
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r36v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:238)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        */
    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException
        */
}
