package xsna;

import com.vk.core.dynamic_loader.DynamicTask;
import com.vk.core.native_loader.NativeLibLoader;
import com.vk.log.L;
import dalvik.system.BaseDexClassLoader;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.Set;
import xsna.yaf;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class wr4 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ wr4(int i, io.reactivex.rxjava3.subjects.d dVar) {
        this.b = 2;
        this.c = i;
        this.d = dVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        Object[] objArr;
        switch (this.b) {
            case 0:
                break;
            case 1:
                ((izs) this.d).invoke(new yaf.b.h(this.c));
                break;
            default:
                int i = this.c;
                io.reactivex.rxjava3.subjects.d dVar = (io.reactivex.rxjava3.subjects.d) this.d;
                DynamicTask b = com.vk.core.dynamic_loader.b.b(i);
                if (b != null) {
                    com.vk.core.dynamic_loader.b.g.remove(b);
                    uqn0 remove = com.vk.core.dynamic_loader.b.h.remove(b);
                    if (remove != null) {
                        remove.c();
                        NativeLibLoader.a.getClass();
                        NativeLibLoader.a<Set<String>> aVar = NativeLibLoader.q;
                        aVar.c = new bpn0(aVar.b);
                        NativeLibLoader.a<String> aVar2 = NativeLibLoader.p;
                        aVar2.c = new bpn0(aVar2.b);
                        try {
                            Field declaredField = BaseDexClassLoader.class.getDeclaredField("pathList");
                            declaredField.setAccessible(true);
                            Object obj = declaredField.get(NativeLibLoader.class.getClassLoader());
                            Field declaredField2 = obj.getClass().getDeclaredField("nativeLibraryPathElements");
                            declaredField2.setAccessible(true);
                            Object[] objArr2 = (Object[]) declaredField2.get(obj);
                            if (objArr2.length == 0) {
                                objArr = objArr2;
                            } else {
                                objArr = (Object[]) Array.newInstance(objArr2.getClass().getComponentType(), objArr2.length);
                                int length = objArr2.length - 1;
                                if (length >= 0) {
                                    int i2 = 0;
                                    while (true) {
                                        objArr[length - i2] = objArr2[i2];
                                        if (i2 != length) {
                                            i2++;
                                        }
                                    }
                                }
                            }
                            if (epx.f(declaredField2.get(obj), objArr2)) {
                                declaredField2.set(obj, objArr);
                            }
                        } catch (Throwable th) {
                            L.C("Failed to reverse nativeLibraryPathElements", th);
                        }
                        vpo vpoVar = com.vk.core.dynamic_loader.b.a;
                        if (vpoVar != null) {
                            vpoVar.d(b, i, remove.a());
                        }
                    }
                }
                dVar.onComplete();
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ wr4(Object obj, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.c = i;
    }
}
