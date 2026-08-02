package xsna;

import android.content.Context;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/* compiled from: AppTracer.kt */
/* loaded from: classes.dex */
public final class ka3 {
    public static a a = a.g;

    /* compiled from: AppTracer.kt */
    public static final class a {
        public static final a g = new a(0);
        public final boolean a;
        public final boolean b;
        public final boolean c;
        public final boolean d;
        public final boolean e;
        public final b f;

        /* compiled from: AppTracer.kt */
        /* renamed from: xsna.ka3$a$a, reason: collision with other inner class name */
        public static final class C3172a {
            /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
                java.lang.NullPointerException
                */
            public static xsna.ka3.a a(
            /*  JADX ERROR: Method generation error
                jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r19v0 ??
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

        public a() {
            this(0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c && this.d == aVar.d && this.e == aVar.e && epx.f(this.f, aVar.f);
        }

        public final int hashCode() {
            return this.f.hashCode() + qoy.b(qoy.b(qoy.b(qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        }

        public final String toString() {
            return "Config(commonCrashEnabled=" + this.a + ", commonAnrEnabled=" + this.b + ", heapDumpEnabled=" + this.c + ", systraceEnabled=" + this.d + ", samplingEnabled=" + this.e + ", otelConfig=" + this.f + ')';
        }

        public a(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, b bVar) {
            this.a = z;
            this.b = z2;
            this.c = z3;
            this.d = z4;
            this.e = z5;
            this.f = bVar;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(int i) {
            this(false, false, false, false, false, b.j);
            b.i.getClass();
        }
    }

    /* compiled from: AppTracer.kt */
    public static final class b {
        public static final a i = new a();
        public static final b j = new b(0);
        public final boolean a;
        public final int b;
        public final boolean c;
        public final boolean d;
        public final int e;
        public final int f;
        public final int g;
        public final double h;

        /* compiled from: AppTracer.kt */
        public static final class a {
        }

        public b() {
            this(0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && this.b == bVar.b && this.c == bVar.c && this.d == bVar.d && this.e == bVar.e && this.f == bVar.f && this.g == bVar.g && Double.compare(this.h, bVar.h) == 0;
        }

        public final int hashCode() {
            return Double.hashCode(this.h) + shy.a(this.g, shy.a(this.f, shy.a(this.e, qoy.b(qoy.b(shy.a(this.b, Boolean.hashCode(this.a) * 31, 31), 31, this.c), 31, this.d), 31), 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OtelConfig(enabled=");
            sb.append(this.a);
            sb.append(", maxSpansCountToUpload=");
            sb.append(this.b);
            sb.append(", uploadOnlyCompleteTraces=");
            sb.append(this.c);
            sb.append(", installAsGlobalTracer=");
            sb.append(this.d);
            sb.append(", maxEventsPerSpan=");
            sb.append(this.e);
            sb.append(", maxAttributesPerEvent=");
            sb.append(this.f);
            sb.append(", maxAttributesPerSpan=");
            sb.append(this.g);
            sb.append(", samplerRatio=");
            return ojp0.a(sb, this.h, ')');
        }

        public /* synthetic */ b(int i2) {
            this(false, 512, false, true, 2048, 128, 128, 0.01d);
        }

        public b(boolean z, int i2, boolean z2, boolean z3, int i3, int i4, int i5, double d) {
            this.a = z;
            this.b = i2;
            this.c = z2;
            this.d = z3;
            this.e = i3;
            this.f = i4;
            this.g = i5;
            this.h = d;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003d, code lost:
    
        if (r1 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0039, code lost:
    
        r1.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0037, code lost:
    
        if (r1 == null) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String a(Context context) {
        StringBuilder sb = new StringBuilder();
        BufferedReader bufferedReader = null;
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new FileReader(new File(context.getFilesDir(), "app_tracer_config.bin")));
            while (true) {
                try {
                    String readLine = bufferedReader2.readLine();
                    if (readLine == null) {
                        break;
                    }
                    sb.append(readLine);
                } catch (FileNotFoundException unused) {
                    bufferedReader = bufferedReader2;
                } catch (IOException unused2) {
                    bufferedReader = bufferedReader2;
                } catch (Throwable th) {
                    th = th;
                    bufferedReader = bufferedReader2;
                    if (bufferedReader != null) {
                        bufferedReader.close();
                    }
                    throw th;
                }
            }
            bufferedReader2.close();
        } catch (FileNotFoundException unused3) {
        } catch (IOException unused4) {
        } catch (Throwable th2) {
            th = th2;
        }
        return sb.toString();
    }
}
