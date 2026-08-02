package xsna;

import android.app.usage.UsageStatsManager;
import androidx.car.app.utils.RemoteUtils;
import com.vk.channels.impl.comments.a;
import com.vk.clips.reports.impl.ClipsReportFragment;
import com.vk.clips.sdk.shared.item.clip.events.ClipItemViewEvent;
import com.vk.clips.sdk.shared.item.common.description.c;
import com.vk.common.presentation.base.view.swiperefreshlayout.SwipeDrawableRefreshLayout;
import com.vk.content.design.view.photo.flow.PhotoFlowToolbarView;
import com.vk.libvideo.bottomsheet.about.delegate.AboutVideoItem;
import com.vk.photos.ui.editalbum.domain.a;
import com.vk.stickers.bridge.b;
import com.vk.toggle.b;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;
import io.appmetrica.analytics.impl.C5054o2;
import io.appmetrica.analytics.impl.G2;
import io.appmetrica.analytics.impl.I2;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Triple;
import xsna.ub9;
import xsna.wfu;
import xsna.xkh;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class p7 implements io.reactivex.rxjava3.functions.l, RemoteUtils.a, io.reactivex.rxjava3.functions.g, ub9.c, SwipeDrawableRefreshLayout.g, r2m, io.reactivex.rxjava3.functions.c, PhotoFlowToolbarView.c, FunctionWithThrowable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ p7(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // androidx.car.app.utils.RemoteUtils.a
    public Object a() {
        rro0.a();
        rro0.a();
        throw null;
    }

    @Override // com.vk.content.design.view.photo.flow.PhotoFlowToolbarView.c
    public void a0() {
        ((kzo) this.c).b.invoke(a.C1516a.b);
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        I2 a;
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                return (AboutVideoItem.d0) ((com.vk.im.engine.internal.api_commands.messages.a) obj2).invoke(obj);
            case 1:
            case 3:
            case 8:
            case 11:
            case 13:
            case 17:
            case 25:
            case 26:
            default:
                a = G2.a((C5054o2) obj2, (UsageStatsManager) obj);
                return a;
            case 2:
                return (hda) ((com.vk.im.engine.internal.api_commands.messages.a) obj2).invoke(obj);
            case 4:
                return (io.reactivex.rxjava3.core.b0) ((mp3) obj2).invoke(obj);
            case 5:
                return (it80) ((gt) obj2).invoke(obj);
            case 6:
                return (List) ((qm0) obj2).invoke(obj);
            case 7:
                return (Boolean) ((com.vk.im.engine.internal.api_commands.messages.a) obj2).invoke(obj);
            case 9:
                return (hda) ((q6a) obj2).invoke(obj);
            case 10:
                return (hda) ((aq1) obj2).invoke(obj);
            case 12:
                return (io.reactivex.rxjava3.core.b0) ((com.vk.im.engine.internal.api_commands.messages.a) obj2).invoke(obj);
            case 14:
                return (wfu.a.C3931a) ((sx4) obj2).invoke(obj);
            case 15:
                return (io.reactivex.rxjava3.core.t) ((com.vk.im.engine.internal.api_commands.messages.a) obj2).invoke(obj);
            case 16:
                return (jpe) ((qm0) obj2).invoke(obj);
            case 18:
                int i2 = ClipsReportFragment.V;
                return (n1f) ((qm0) obj2).invoke(obj);
            case 19:
                return (List) ((com.vk.im.engine.internal.api_commands.messages.a) obj2).invoke(obj);
            case 20:
                return (b.a) ((qm0) obj2).invoke(obj);
            case 21:
                return ((xkh.e) obj2).invoke(obj);
            case 22:
                return ((muh) obj2).invoke(obj);
            case 23:
                return (it80) ((r0j) obj2).invoke(obj);
            case 24:
                return (CharSequence) ((qm0) obj2).invoke(obj);
            case 27:
                return (b.c) ((k0j) obj2).invoke(obj);
            case 28:
                return (io.reactivex.rxjava3.core.b0) ((k0j) obj2).invoke(obj);
        }
    }

    @Override // xsna.ub9.c
    public Object attachCompleter(ub9.a aVar) {
        re9 re9Var = (re9) this.c;
        re9Var.c.execute(new ne9(0, re9Var, aVar));
        return "triggerAf";
    }

    @Override // io.reactivex.rxjava3.functions.g
    public Object d(Object obj, Object obj2, Object obj3) {
        switch (this.b) {
            case 3:
                return (Triple) ((nh5) this.c).invoke(obj, obj2, obj3);
            default:
                return (List) ((etp) this.c).invoke(obj, obj2, obj3);
        }
    }

    @Override // xsna.r2m
    public void g(com.vk.clips.sdk.shared.item.common.description.c cVar) {
        ClipItemViewEvent w4dVar;
        ClipItemViewEvent clipItemViewEvent;
        u6d u6dVar = ((i1d) this.c).b;
        if (cVar instanceof c.b) {
            clipItemViewEvent = u4d.b;
        } else if (cVar instanceof c.a) {
            clipItemViewEvent = t4d.b;
        } else {
            if (cVar instanceof c.C0669c) {
                w4dVar = new v4d(((c.C0669c) cVar).a);
            } else if (cVar instanceof c.e) {
                w4dVar = new x4d(((c.e) cVar).a);
            } else {
                if (!(cVar instanceof c.d)) {
                    throw new NoWhenBranchMatchedException();
                }
                w4dVar = new w4d(((c.d) cVar).a);
            }
            clipItemViewEvent = w4dVar;
        }
        u6dVar.a(clipItemViewEvent);
    }

    @Override // com.vk.common.presentation.base.view.swiperefreshlayout.SwipeDrawableRefreshLayout.g
    public void h() {
        ((com.vk.channels.impl.comments.e) this.c).O(a.m.b);
    }

    @Override // io.reactivex.rxjava3.functions.c
    public Object apply(Object obj, Object obj2) {
        return (Pair) ((gre) this.c).invoke(obj, obj2);
    }
}
