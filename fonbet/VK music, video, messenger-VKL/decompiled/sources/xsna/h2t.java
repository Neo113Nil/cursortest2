package xsna;

import android.graphics.Bitmap;
import com.vk.photo.editor.domain.LowMemoryException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.b4p;
import xsna.o1t;

/* compiled from: GLTextureRepository.kt */
/* loaded from: classes4.dex */
public final class h2t {
    public final h6 a;
    public final we0 b;
    public final l3g c;
    public final u40 d;
    public final ConcurrentHashMap<String, eyx> e = new ConcurrentHashMap<>();

    /* compiled from: GLTextureRepository.kt */
    public interface a {
        e4p e();

        void f(f2t f2tVar);

        b4p.a getConfig();

        String getKey();

        void onLowMemory();
    }

    /* compiled from: GLTextureRepository.kt */
    @b6l(c = "com.vk.photo.editor.features.collage.gl.GLTextureRepository$getTexture$1$1", f = "GLTextureRepository.kt", l = {57}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ a $request;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(a aVar, spj<? super b> spjVar) {
            super(2, spjVar);
            this.$request = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            b bVar = h2t.this.new b(this.$request, spjVar);
            bVar.L$0 = obj;
            return bVar;
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((b) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            o3p o3pVar;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            try {
                try {
                    try {
                        if (i == 0) {
                            kotlin.a.a(obj);
                            n4p n4pVar = (n4p) h2t.this.d.invoke();
                            if (n4pVar != null) {
                                n4pVar.d("VkPhotoEditorGLTextureRepository: going to load image request=" + this.$request);
                            }
                            o3p c = ((p3p) h2t.this.a.invoke()).c(this.$request.e(), this.$request.getConfig());
                            if (c == null) {
                                a aVar = this.$request;
                                h2t h2tVar = h2t.this;
                                aVar.getClass();
                                h2tVar.e.remove(aVar.getKey());
                                s3q0 s3q0Var = s3q0.a;
                                h2t.this.e.remove(this.$request.getKey());
                                return s3q0Var;
                            }
                            Bitmap bitmap = c.c.a;
                            n4p n4pVar2 = (n4p) h2t.this.d.invoke();
                            if (n4pVar2 != null) {
                                n4pVar2.d("VkPhotoEditorGLTextureRepository: image loaded w=" + bitmap.getWidth() + " h=" + bitmap.getHeight() + " link=" + this.$request.e());
                            }
                            h2t h2tVar2 = h2t.this;
                            this.L$0 = null;
                            this.L$1 = c;
                            this.label = 1;
                            Object a = h2t.a(h2tVar2, c, this);
                            if (a == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            o3pVar = c;
                            obj = a;
                        } else {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            o3pVar = (o3p) this.L$1;
                            kotlin.a.a(obj);
                        }
                        f2t f2tVar = (f2t) obj;
                        n4p n4pVar3 = (n4p) h2t.this.d.invoke();
                        if (n4pVar3 != null) {
                            n4pVar3.d("VkPhotoEditorGLTextureRepository: texture loaded link=" + this.$request.e() + " texture=" + f2tVar);
                        }
                        ((p3p) h2t.this.a.invoke()).a(o3pVar);
                        this.$request.f(f2tVar);
                    } catch (LowMemoryException unused) {
                        this.$request.onLowMemory();
                    }
                } catch (Throwable unused2) {
                    this.$request.getClass();
                }
                h2t.this.e.remove(this.$request.getKey());
                return s3q0.a;
            } catch (Throwable th) {
                h2t.this.e.remove(this.$request.getKey());
                throw th;
            }
        }
    }

    public h2t(h6 h6Var, we0 we0Var, l3g l3gVar, u40 u40Var) {
        this.a = h6Var;
        this.b = we0Var;
        this.c = l3gVar;
        this.d = u40Var;
    }

    public static final Object a(h2t h2tVar, o3p o3pVar, b bVar) {
        h2tVar.getClass();
        gzg0 gzg0Var = new gzg0(s7s0.c(bVar));
        h2tVar.c.b(new j2t(o3pVar, gzg0Var));
        Object a2 = gzg0Var.a();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return a2;
    }

    public final Object b(o1t.a aVar, i1t i1tVar) {
        List l = e43.l(aVar.a, aVar.b);
        ArrayList arrayList = new ArrayList();
        Iterator it = l.iterator();
        while (it.hasNext()) {
            o3p c = ((p3p) this.a.invoke()).c((e4p) it.next(), b4p.a.C2587a.e);
            if (c != null) {
                arrayList.add(c);
            }
        }
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((o3p) it2.next()).c.a);
        }
        gzg0 gzg0Var = new gzg0(s7s0.c(i1tVar));
        this.c.b(new i2t(arrayList2, arrayList, gzg0Var, this));
        Object a2 = gzg0Var.a();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return a2;
    }

    public final void c(a aVar) {
        synchronized (this.e) {
            if (this.e.containsKey(aVar.getKey())) {
                return;
            }
            ConcurrentHashMap<String, eyx> concurrentHashMap = this.e;
            String key = aVar.getKey();
            yvj yvjVar = (yvj) this.b.invoke();
            bdn bdnVar = bdn.a;
            concurrentHashMap.put(key, myc0.h(yvjVar, wgl.c, null, new b(aVar, null), 2));
            s3q0 s3q0Var = s3q0.a;
        }
    }
}
