package xsna;

import android.app.Activity;
import android.content.DialogInterface;
import android.database.Cursor;
import androidx.appcompat.app.d;
import com.vk.dto.stories.model.clickable.ClickableMarketItem;
import com.vk.superapp.bridges.SuperappUiRouterBridge;
import com.vk.superapp.bridges.dto.VkAlertData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Ref$BooleanRef;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class okc implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ okc(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        int i2 = 0;
        Object obj = this.f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                qkc.l((y5p0) obj3, (ymm0) obj2, new mkc(i2, (qkc) obj4, (ClickableMarketItem) obj));
                return s3q0.a;
            case 1:
                rey reyVar = (rey) obj4;
                String str = (String) obj2;
                izs izsVar = (izs) obj;
                Cursor d = reyVar.b.d((String) obj3, new String[]{str});
                try {
                    Object invoke = d.moveToFirst() ? izsVar.invoke(d) : null;
                    d.close();
                    ReentrantLock reentrantLock = reyVar.d;
                    reentrantLock.lock();
                    try {
                        reyVar.c.put(str, invoke);
                        s3q0 s3q0Var = s3q0.a;
                        return invoke;
                    } finally {
                        reentrantLock.unlock();
                    }
                } catch (Throwable th) {
                    d.close();
                    throw th;
                }
            default:
                VkAlertData vkAlertData = (VkAlertData) obj4;
                iok0 iok0Var = (iok0) obj3;
                Activity activity = (Activity) obj2;
                final SuperappUiRouterBridge.d dVar = (SuperappUiRouterBridge.d) obj;
                if (vkAlertData instanceof VkAlertData.b) {
                    VkAlertData.b bVar = (VkAlertData.b) vkAlertData;
                    d.a v0 = iok0Var.v0(hnj.a(activity), bVar.c);
                    v0.setTitle(bVar.a);
                    v0.d(bVar.b);
                    final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
                    VkAlertData.a aVar = bVar.d;
                    if (aVar != null) {
                        v0.j(aVar.a, new fsd(dVar, aVar, ref$BooleanRef, 1));
                    }
                    final VkAlertData.a aVar2 = bVar.f;
                    if (aVar2 != null) {
                        v0.g(aVar2.a, new DialogInterface.OnClickListener() { // from class: xsna.eok0
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i3) {
                                SuperappUiRouterBridge.d.this.a(aVar2);
                                ref$BooleanRef.element = true;
                                dialogInterface.dismiss();
                            }
                        });
                    }
                    final VkAlertData.a aVar3 = bVar.e;
                    if (aVar3 != null) {
                        v0.f(aVar3.a, new DialogInterface.OnClickListener() { // from class: xsna.fok0
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i3) {
                                SuperappUiRouterBridge.d.this.a(aVar3);
                                ref$BooleanRef.element = true;
                                dialogInterface.dismiss();
                            }
                        });
                    }
                    v0.i(new DialogInterface.OnDismissListener() { // from class: xsna.gok0
                        @Override // android.content.DialogInterface.OnDismissListener
                        public final void onDismiss(DialogInterface dialogInterface) {
                            if (Ref$BooleanRef.this.element) {
                                return;
                            }
                            dVar.onDismiss();
                        }
                    });
                    v0.m();
                } else {
                    if (!(vkAlertData instanceof VkAlertData.c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    final VkAlertData.c cVar = (VkAlertData.c) vkAlertData;
                    d.a v02 = iok0Var.v0(hnj.a(activity), null);
                    v02.setTitle(cVar.a);
                    List<VkAlertData.a> list = cVar.b;
                    ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((VkAlertData.a) it.next()).a);
                    }
                    String[] strArr = (String[]) arrayList.toArray(new String[0]);
                    final Ref$BooleanRef ref$BooleanRef2 = new Ref$BooleanRef();
                    v02.i(new DialogInterface.OnDismissListener() { // from class: xsna.bok0
                        @Override // android.content.DialogInterface.OnDismissListener
                        public final void onDismiss(DialogInterface dialogInterface) {
                            if (Ref$BooleanRef.this.element) {
                                return;
                            }
                            dVar.onDismiss();
                        }
                    });
                    v02.b(strArr, new DialogInterface.OnClickListener() { // from class: xsna.cok0
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i3) {
                            List<VkAlertData.a> list2 = VkAlertData.c.this.b;
                            int size = list2.size();
                            if (size <= i3) {
                                xgx0.a.getClass();
                                xgx0.g("Index exceeds list bounds: index = " + i3 + ", size = " + size);
                            } else {
                                ref$BooleanRef2.element = true;
                                dVar.a(list2.get(i3));
                            }
                            dialogInterface.dismiss();
                        }
                    });
                    v02.m();
                }
                return s3q0.a;
        }
    }
}
