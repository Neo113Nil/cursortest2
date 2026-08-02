package xsna;

import android.content.Intent;
import androidx.activity.ComponentActivity;
import com.vk.core.fragments.FragmentImpl;
import xsna.lb0;
import xsna.va0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class t8i implements Runnable {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ t8i(int i, Intent intent, FragmentImpl fragmentImpl) {
        this.d = intent;
        this.e = fragmentImpl;
        this.c = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        int i2 = this.c;
        Object obj = this.e;
        Object obj2 = this.d;
        switch (i) {
            case 0:
                ComponentActivity.f fVar = (ComponentActivity.f) obj2;
                T t = ((va0.a) obj).a;
                String str = (String) fVar.a.get(Integer.valueOf(i2));
                if (str != null) {
                    lb0.a aVar = (lb0.a) fVar.e.get(str);
                    if ((aVar != null ? aVar.a : null) != null) {
                        ua0<O> ua0Var = aVar.a;
                        if (fVar.d.remove(str)) {
                            ua0Var.onActivityResult(t);
                            break;
                        }
                    } else {
                        fVar.g.remove(str);
                        fVar.f.put(str, t);
                        break;
                    }
                }
                break;
            default:
                Intent intent = (Intent) obj2;
                FragmentImpl fragmentImpl = (FragmentImpl) obj;
                qcy<Object>[] qcyVarArr = FragmentImpl.M;
                if (intent == null) {
                    fragmentImpl.setResult(i2);
                } else {
                    fragmentImpl.setResult(i2, intent);
                }
                fragmentImpl.finish();
                break;
        }
    }

    public /* synthetic */ t8i(ComponentActivity.f fVar, int i, va0.a aVar) {
        this.d = fVar;
        this.c = i;
        this.e = aVar;
    }
}
