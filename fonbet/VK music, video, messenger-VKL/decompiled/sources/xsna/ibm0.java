package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import xsna.jbm0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class ibm0 implements Callable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ibm0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.b) {
            case 0:
                jbm0 jbm0Var = (jbm0) this.c;
                Context context = jbm0Var.a;
                ArrayList arrayList = jbm0Var.c;
                if (arrayList != null) {
                    return arrayList;
                }
                synchronized (jbm0Var.b) {
                    ArrayList arrayList2 = jbm0Var.c;
                    if (arrayList2 != null) {
                        return arrayList2;
                    }
                    List<jbm0.a> list = jbm0Var.d;
                    ArrayList arrayList3 = new ArrayList(c5g.u(list, 10));
                    for (jbm0.a aVar : list) {
                        Drawable drawable = context.getDrawable(aVar.b);
                        if (drawable == null) {
                            throw new IllegalStateException(("Drawable not found for id " + aVar.a).toString());
                        }
                        InputStream openRawResource = context.getResources().openRawResource(aVar.c);
                        Charset charset = emb.b;
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(openRawResource, charset), 8192);
                        try {
                            String b = a0a.b(bufferedReader);
                            bufferedReader.close();
                            bufferedReader = new BufferedReader(new InputStreamReader(context.getResources().openRawResource(aVar.d), charset), 8192);
                            try {
                                String b2 = a0a.b(bufferedReader);
                                bufferedReader.close();
                                arrayList3.add(new zam0(aVar.a, drawable, b, b2, aVar.e));
                            } finally {
                            }
                        } finally {
                        }
                    }
                    jbm0Var.c = arrayList3;
                    return arrayList3;
                }
            default:
                return Boolean.valueOf(((o4x0) this.c).a());
        }
    }
}
