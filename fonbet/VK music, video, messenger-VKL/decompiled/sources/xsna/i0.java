package xsna;

import android.graphics.Rect;
import android.os.RemoteException;
import android.text.Layout;
import android.util.Log;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.ironsource.Aa;
import com.ironsource.B2;
import com.ironsource.C4637xa;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.preference.Preference;
import com.vk.core.utils.VerifyInfoHelper;
import com.vk.core.view.components.cell.VkCell;
import com.vk.dto.common.VerifyInfo;
import com.vk.superapp.browser.internal.ui.menu.action.OtherAction;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import one.video.calls.sdk_private.aF;
import org.webrtc.EglRenderer;
import ru.mail.libverify.api.VerificationApi;
import ru.mail.libverify.controls.VerificationController;
import xsna.dgl0;
import xsna.l2f;
import xsna.wjk0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes13.dex */
public final /* synthetic */ class i0 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ i0(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = 0;
        switch (this.b) {
            case 0:
                Aa.b((Aa) this.c, (C4637xa) this.d);
                return;
            case 1:
                B2.a((B2) this.c, (Map) this.d);
                return;
            case 2:
                l2f.a aVar = (l2f.a) this.c;
                io.reactivex.rxjava3.disposables.c cVar = (io.reactivex.rxjava3.disposables.c) this.d;
                l2f l2fVar = aVar.f;
                if (l2fVar != null) {
                    l2fVar.setOnCancelListener(new j2f(cVar, i));
                    return;
                }
                return;
            case 3:
                ((EglRenderer) this.c).lambda$release$0((CountDownLatch) this.d);
                return;
            case 4:
                ArrayList arrayList = (ArrayList) this.c;
                jxq jxqVar = (jxq) this.d;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    RecyclerView.e0 e0Var = (RecyclerView.e0) it.next();
                    nbf0 nbf0Var = jxqVar.h;
                    ArrayList arrayList2 = jxqVar.s;
                    nbf0Var.getClass();
                    View view = e0Var.itemView;
                    ViewPropertyAnimator animate = view.animate();
                    arrayList2.add(e0Var);
                    animate.setDuration(200L).alpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).translationXBy(-view.getWidth()).setListener(new mbf0(view, animate, e0Var, arrayList2, jxqVar)).start();
                }
                arrayList.clear();
                jxqVar.m.remove(arrayList);
                return;
            case 5:
                m0v m0vVar = (m0v) this.c;
                anv anvVar = (anv) this.d;
                m0vVar.getClass();
                try {
                    String string = Preference.h(m0vVar.b, 0, "PermissionTokenManager.healthdata").getString("token", null);
                    if (string == null) {
                        string = "";
                    }
                    anvVar.onSuccess(string);
                    return;
                } catch (RemoteException e) {
                    Log.e("m0v", "HealthDataSdkService#getPermissionToken failed: " + e.getMessage());
                    return;
                }
            case 6:
                r9v r9vVar = (r9v) this.c;
                h9v h9vVar = (h9v) this.d;
                j9v.this.c.G(h9vVar.m);
                return;
            case 7:
                yx50 yx50Var = (yx50) this.c;
                View view2 = (View) this.d;
                synchronized (yx50Var) {
                    long m = Preference.m(0L, "content_info_hint", "content_info_hint_show_time");
                    yx50Var.w = m;
                    if (m + pgj.b < System.currentTimeMillis()) {
                        view2.post(new qn9(5, yx50Var, view2));
                    }
                }
                return;
            case 8:
                com.vk.superapp.browser.internal.ui.menu.action.e eVar = (com.vk.superapp.browser.internal.ui.menu.action.e) this.c;
                OtherAction otherAction = (OtherAction) this.d;
                VkCell vkCell = eVar.o;
                a820 a820Var = eVar.m;
                Rect rect = new Rect();
                vkCell.getGlobalVisibleRect(rect);
                s3q0 s3q0Var = s3q0.a;
                a820Var.a(otherAction, rect);
                return;
            case 9:
                dof0 dof0Var = (dof0) this.c;
                a5 a5Var = (a5) this.d;
                jof0 jof0Var = dof0Var.j;
                if (jof0Var == null) {
                    jof0Var = new jof0();
                }
                dof0Var.j = jof0Var;
                jof0Var.a = dof0Var;
                a5Var.invoke(dof0Var.j);
                return;
            case 10:
                akk0 akk0Var = (akk0) this.c;
                wjk0.a aVar2 = (wjk0.a) this.d;
                View view3 = akk0Var.j;
                TextView textView = akk0Var.c;
                Layout layout = textView.getLayout();
                int lineCount = textView.getLineCount();
                VerifyInfo verifyInfo = aVar2.e;
                if (verifyInfo == null) {
                    view3.setVisibility(8);
                    return;
                }
                view3.setBackground(VerifyInfoHelper.h(VerifyInfoHelper.a, verifyInfo, akk0Var.getContext(), VerifyInfoHelper.ColorTheme.white, 24));
                view3.setVisibility(0);
                if (lineCount <= 0 || layout.getEllipsisCount(lineCount - 1) <= 0) {
                    return;
                }
                view3.setTranslationX(-iah0.a(4.0f));
                return;
            case 11:
                dgl0 dgl0Var = (dgl0) this.c;
                dgl0.a aVar3 = (dgl0.a) this.d;
                ir4 ir4Var = dgl0Var.a;
                if (ir4Var != null) {
                    ir4Var.A();
                }
                aVar3.b = null;
                return;
            case 12:
                ((VerificationController) this.c).lambda$unSubscribeSmsNotificationListener$12((VerificationApi.SmsCodeNotificationListener) this.d);
                return;
            case 13:
                ((hbt0) this.c).B((xh5) this.d);
                return;
            case 14:
                ((ru.mail.libverify.b0.a) this.c).a((Exception) this.d);
                return;
            default:
                cny0 cny0Var = (cny0) this.c;
                aF aFVar = (aF) this.d;
                one.video.calls.sdk_private.x xVar = cny0Var.f;
                Object[] objArr = {new fhy0(), new wgy0(2)};
                ArrayList arrayList3 = new ArrayList(2);
                while (i < 2) {
                    Object obj = objArr[i];
                    Objects.requireNonNull(obj);
                    arrayList3.add(obj);
                    i++;
                }
                xVar.a(Collections.unmodifiableList(arrayList3), aFVar);
                return;
        }
    }
}
