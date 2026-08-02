package xsna;

import com.facebook.common.internal.ImmutableList;
import com.facebook.common.internal.ImmutableMap;
import com.facebook.common.util.TriState;
import com.facebook.imagepipeline.memory.MemoryPooledByteBufferOutputStream;
import com.facebook.imagepipeline.request.ImageRequest;
import java.util.HashMap;
import java.util.concurrent.Executor;
import xsna.myx;

/* compiled from: ResizeAndRotateProducer.java */
/* loaded from: classes12.dex */
public final class v9g0 implements thd0<rip> {
    public final Executor a;
    public final b320 b;
    public final thd0<rip> c;
    public final boolean d;
    public final gmw e;

    /* compiled from: ResizeAndRotateProducer.java */
    public class a extends wtl<rip, rip> {
        public final boolean c;
        public final gmw d;
        public final uhd0 e;
        public boolean f;
        public final myx g;

        /* compiled from: ResizeAndRotateProducer.java */
        /* renamed from: xsna.v9g0$a$a, reason: collision with other inner class name */
        public class C3874a implements myx.b {
            public C3874a() {
            }

            @Override // xsna.myx.b
            public final void a(rip ripVar, int i) {
                int i2 = i;
                a aVar = a.this;
                l7j<O> l7jVar = aVar.b;
                if (ripVar == null) {
                    l7jVar.b(i2, null);
                    return;
                }
                gmw gmwVar = aVar.d;
                ripVar.y();
                fmw createImageTranscoder = gmwVar.createImageTranscoder(ripVar.c, aVar.c);
                createImageTranscoder.getClass();
                uhd0 uhd0Var = aVar.e;
                uhd0Var.q().k(uhd0Var, "ResizeAndRotateProducer");
                ImageRequest r = uhd0Var.r();
                MemoryPooledByteBufferOutputStream b = v9g0.this.b.b();
                try {
                    eng0 eng0Var = r.i;
                    x9g0 x9g0Var = r.h;
                    ripVar.y();
                    emw transcode = createImageTranscoder.transcode(ripVar, b, eng0Var, x9g0Var, null, 85, ripVar.j);
                    if (transcode.a == 2) {
                        throw new RuntimeException("Error while transcoding the image");
                    }
                    ImmutableMap l = aVar.l(ripVar, r.h, transcode, createImageTranscoder.getIdentifier());
                    kcl v = uvf.v(b.p());
                    try {
                        rip ripVar2 = new rip(v);
                        ripVar2.c = hgl.a;
                        try {
                            ripVar2.s();
                            uhd0Var.q().f(uhd0Var, "ResizeAndRotateProducer", l);
                            if (transcode.a != 1) {
                                i2 |= 16;
                            }
                            l7jVar.b(i2, ripVar2);
                            v.close();
                        } finally {
                            ripVar2.close();
                        }
                    } catch (Throwable th) {
                        uvf.q(v);
                        throw th;
                    }
                } catch (Exception e) {
                    uhd0Var.q().b(uhd0Var, "ResizeAndRotateProducer", e, null);
                    if (ac6.d(i2)) {
                        l7jVar.onFailure(e);
                    }
                } finally {
                    b.close();
                }
            }
        }

        /* compiled from: ResizeAndRotateProducer.java */
        public class b extends uk6 {
            public final /* synthetic */ l7j a;

            public b(l7j l7jVar) {
                this.a = l7jVar;
            }

            @Override // xsna.uk6, xsna.vhd0
            public final void a() {
                a aVar = a.this;
                if (aVar.e.o()) {
                    aVar.g.d();
                }
            }

            @Override // xsna.vhd0
            public final void c() {
                a aVar = a.this;
                aVar.g.a();
                aVar.f = true;
                this.a.a();
            }
        }

        public a(l7j<rip> l7jVar, uhd0 uhd0Var, boolean z, gmw gmwVar) {
            super(l7jVar);
            this.f = false;
            this.e = uhd0Var;
            uhd0Var.r().getClass();
            this.c = z;
            this.d = gmwVar;
            this.g = new myx(v9g0.this.a, new C3874a());
            uhd0Var.p(new b(l7jVar));
        }

        /* JADX WARN: Code restructure failed: missing block: B:69:0x0072, code lost:
        
            if (r7 != false) goto L28;
         */
        /* JADX WARN: Removed duplicated region for block: B:77:0x0089  */
        /* JADX WARN: Removed duplicated region for block: B:78:0x008c  */
        @Override // xsna.ac6
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void h(int i, Object obj) {
            boolean z;
            TriState triState;
            boolean z2;
            rip ripVar = (rip) obj;
            if (this.f) {
                return;
            }
            boolean d = ac6.d(i);
            l7j<O> l7jVar = this.b;
            if (ripVar == null) {
                if (d) {
                    l7jVar.b(1, null);
                    return;
                }
                return;
            }
            ripVar.y();
            siw siwVar = ripVar.c;
            uhd0 uhd0Var = this.e;
            ImageRequest r = uhd0Var.r();
            fmw createImageTranscoder = this.d.createImageTranscoder(siwVar, this.c);
            createImageTranscoder.getClass();
            ripVar.y();
            if (ripVar.c == siw.c) {
                triState = TriState.UNSET;
            } else {
                ripVar.y();
                if (createImageTranscoder.canTranscode(ripVar.c)) {
                    eng0 eng0Var = r.i;
                    if (!eng0Var.b) {
                        if (y0y.b(eng0Var, ripVar) == 0) {
                            if (eng0Var.a == -2 || eng0Var.b) {
                                ripVar.e = 0;
                                z2 = false;
                            } else {
                                ImmutableList<Integer> immutableList = y0y.a;
                                ripVar.y();
                                z2 = immutableList.contains(Integer.valueOf(ripVar.e));
                            }
                        }
                        z = true;
                        triState = !(!z || createImageTranscoder.canResize(ripVar, r.i, r.h)) ? TriState.YES : TriState.NO;
                    }
                    z = false;
                    if (!(!z || createImageTranscoder.canResize(ripVar, r.i, r.h))) {
                    }
                } else {
                    triState = TriState.NO;
                }
            }
            if (d || triState != TriState.UNSET) {
                if (triState == TriState.YES) {
                    myx myxVar = this.g;
                    if (myxVar.f(ripVar, i)) {
                        if (d || uhd0Var.o()) {
                            myxVar.d();
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (siwVar != hgl.a && siwVar != hgl.k) {
                    int i2 = uhd0Var.r().i.a;
                    if (!(i2 == -1)) {
                        if (i2 != -2) {
                            if (i2 == -1) {
                                throw new IllegalStateException("Rotation is set to use EXIF");
                            }
                            ripVar = rip.b(ripVar);
                            if (ripVar != null) {
                                ripVar.d = i2;
                            }
                        }
                    }
                } else if (!uhd0Var.r().i.b) {
                    ripVar.y();
                    if (ripVar.d != 0) {
                        ripVar.y();
                        if (ripVar.d != -1 && (ripVar = rip.b(ripVar)) != null) {
                            ripVar.d = 0;
                        }
                    }
                }
                l7jVar.b(i, ripVar);
            }
        }

        public final ImmutableMap l(rip ripVar, x9g0 x9g0Var, emw emwVar, String str) {
            String str2;
            long j;
            uhd0 uhd0Var = this.e;
            if (!uhd0Var.q().i(uhd0Var, "ResizeAndRotateProducer")) {
                return null;
            }
            StringBuilder sb = new StringBuilder();
            ripVar.y();
            sb.append(ripVar.f);
            sb.append("x");
            ripVar.y();
            sb.append(ripVar.g);
            String sb2 = sb.toString();
            if (x9g0Var != null) {
                str2 = x9g0Var.a + "x" + x9g0Var.b;
            } else {
                str2 = "Unspecified";
            }
            HashMap hashMap = new HashMap();
            ripVar.y();
            hashMap.put("Image format", String.valueOf(ripVar.c));
            hashMap.put("Original size", sb2);
            hashMap.put("Requested size", str2);
            myx myxVar = this.g;
            synchronized (myxVar) {
                j = myxVar.i - myxVar.h;
            }
            hashMap.put("queueTime", String.valueOf(j));
            hashMap.put("Transcoder id", str);
            hashMap.put("Transcoding result", String.valueOf(emwVar));
            return new ImmutableMap(hashMap);
        }
    }

    public v9g0(Executor executor, b320 b320Var, thd0<rip> thd0Var, boolean z, gmw gmwVar) {
        executor.getClass();
        this.a = executor;
        b320Var.getClass();
        this.b = b320Var;
        this.c = thd0Var;
        gmwVar.getClass();
        this.e = gmwVar;
        this.d = z;
    }

    @Override // xsna.thd0
    public final void b(l7j<rip> l7jVar, uhd0 uhd0Var) {
        this.c.b(new a(l7jVar, uhd0Var, this.d, this.e), uhd0Var);
    }
}
