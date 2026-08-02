package androidx.asynclayoutinflater.view;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import defpackage.e89;
import defpackage.ka3;
import defpackage.la3;
import defpackage.ssv;
import defpackage.tsv;
import java.util.LinkedHashMap;
import java.util.LinkedList;

/* loaded from: classes.dex */
public final class a {
    public final LayoutInflater a;
    public final Handler b;
    public final la3 c;

    public a(Context context) {
        Handler.Callback callback = new Handler.Callback() { // from class: androidx.asynclayoutinflater.view.AsyncLayoutInflater$1
            private /* synthetic */ void lambda$handleMessage$0(ka3 ka3Var) {
                a.a(ka3Var, a.this.c);
            }

            @Override // android.os.Handler.Callback
            public boolean handleMessage(Message message) {
                ka3 ka3Var = (ka3) message.obj;
                if (ka3Var.d == null) {
                    ka3Var.d = ka3Var.a.inflate(ka3Var.c, (ViewGroup) null, false);
                }
                a.a(ka3Var, a.this.c);
                return true;
            }
        };
        this.a = new AsyncLayoutInflater$BasicInflater(context);
        this.b = new Handler(Looper.myLooper(), callback);
        this.c = la3.c;
    }

    public static void a(ka3 ka3Var, la3 la3Var) {
        e89 e89Var = ka3Var.e;
        View view = ka3Var.d;
        int i = ka3Var.c;
        Context context = (Context) e89Var.b;
        tsv tsvVar = (tsv) e89Var.c;
        ssv ssvVar = new ssv(context, i);
        LinkedHashMap linkedHashMap = tsvVar.a;
        Object obj = linkedHashMap.get(ssvVar);
        if (obj == null) {
            obj = new LinkedList();
            linkedHashMap.put(ssvVar, obj);
        }
        ((LinkedList) obj).add(view);
        la3Var.getClass();
        ka3Var.e = null;
        ka3Var.a = null;
        ka3Var.b = null;
        ka3Var.c = 0;
        ka3Var.d = null;
        la3Var.b.a0(ka3Var);
    }
}
