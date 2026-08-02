package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewStub;
import com.yandex.go.superapp.orders.card.header.trails.TrackingCardObjectWithPlateNumberView;
import com.yandex.messaging.internal.ServerMessageRef;
import com.yandex.messaging.internal.view.messagemenu.MessageMenuDialog;
import com.ybsdk.feature.kyc.internal.screens.photo.KycPhotoFragment;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import kotlin.collections.a;
import kotlin.sequences.b;

/* loaded from: classes5.dex */
public final /* synthetic */ class p61 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;

    public /* synthetic */ p61(int i, sls slsVar, sls slsVar2) {
        this.a = 1;
        this.b = i;
        this.c = slsVar;
        this.w = slsVar2;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        List W;
        zy11 updateRotation$lambda$23;
        zy11 renderObjectImage$lambda$0;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        int i2 = this.b;
        Object obj = this.w;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                boj0.i(((r61) obj2).g, true, this.b, null, (su0) obj, 20);
                return zy11Var;
            case 1:
                sls slsVar = (sls) obj2;
                sls slsVar2 = (sls) obj;
                if (i2 == 0) {
                    slsVar.invoke();
                } else if (i2 == 1) {
                    slsVar2.invoke();
                }
                return zy11Var;
            case 2:
                ((pk3) obj2).startActivityForResult((Intent) obj, i2);
                return zy11Var;
            case 3:
                ((tls) obj2).invoke(((List) obj).get(i2));
                return zy11Var;
            case 4:
                ((a40) ((md6) obj2).b).e(i2, (Intent) obj);
                return zy11Var;
            case 5:
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(((Context) obj2).getResources().openRawResource(((TypedArray) obj).getResourceId(i2, 0)), uza.a), 8192);
                try {
                    List s = b.s(new a7e(new i73(4, bufferedReader)));
                    bufferedReader.close();
                    List list = s;
                    ArrayList arrayList = new ArrayList(tcc.n(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        W = evu0.W((String) it.next(), new String[]{","}, (r2 & 4) != 0 ? 0 : 2);
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj3 : W) {
                            if (cy11.a((String) obj3)) {
                                arrayList2.add(obj3);
                            }
                        }
                        arrayList.add(a.J0(arrayList2));
                    }
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        Object next = it2.next();
                        if (!((List) next).isEmpty()) {
                            arrayList3.add(next);
                        }
                    }
                    ArrayList arrayList4 = new ArrayList(tcc.n(arrayList3, 10));
                    Iterator it3 = arrayList3.iterator();
                    while (it3.hasNext()) {
                        List list2 = (List) it3.next();
                        arrayList4.add(new tun((String) a.P(list2), a.J(list2, 1)));
                    }
                    return arrayList4;
                } finally {
                }
            case 6:
                updateRotation$lambda$23 = KycPhotoFragment.updateRotation$lambda$23((KycPhotoFragment) obj2, (lpx) obj, i2);
                return updateRotation$lambda$23;
            case 7:
                View inflate = ((ViewStub) ((i700) obj2).F.findViewById(i2)).inflate();
                ((Consumer) obj).accept(inflate);
                return inflate;
            case 8:
                ServerMessageRef serverMessageRef = (ServerMessageRef) obj;
                MessageMenuDialog messageMenuDialog = ((com.yandex.messaging.internal.view.messagemenu.a) obj2).A;
                if (messageMenuDialog != null) {
                    messageMenuDialog.onPublicReactionListChosen(serverMessageRef, i2);
                }
                return zy11Var;
            case 9:
                tu0 tu0Var = (tu0) obj;
                ((xh20) obj2).a.e(tu0Var.a, i2, tu0Var.b);
                return zy11Var;
            default:
                renderObjectImage$lambda$0 = TrackingCardObjectWithPlateNumberView.renderObjectImage$lambda$0((TrackingCardObjectWithPlateNumberView) obj2, (List) obj, i2);
                return renderObjectImage$lambda$0;
        }
    }

    public /* synthetic */ p61(Object obj, int i, Object obj2, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = i;
        this.w = obj2;
    }

    public /* synthetic */ p61(Object obj, Object obj2, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.w = obj2;
        this.b = i;
    }
}
