package xsna;

import android.view.MotionEvent;
import android.view.View;
import com.vk.clips.design.view.stikers.ClipsStickersView;
import com.vk.clips.sdk.shared.item.ads.events.AdsItemViewEvent;
import com.vk.clips.sdk.shared.item.common.description.c;
import com.vk.content.design.view.camera.MasksWrap;
import com.vk.dto.common.data.Subscription;
import com.vk.dto.common.data.VKList;
import com.vk.dto.masks.Mask;
import com.vk.notifications.CommunityGroupedNotificationsFragment;
import com.vk.stories.design.view.stickers.StickersDrawingViewGroup;
import java.io.IOException;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class ox0 implements r2m, io.reactivex.rxjava3.functions.l, io.reactivex.rxjava3.functions.m, StickersDrawingViewGroup.k, ClipsStickersView.d, dwp, io.reactivex.rxjava3.functions.c {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ox0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.c
    public Object apply(Object obj, Object obj2) {
        return (Subscription) ((mq2) this.c).invoke(obj, obj2);
    }

    @Override // xsna.dwp
    public void b(IOException iOException) {
        lfx.c((zpa0) this.c, iOException);
    }

    @Override // com.vk.clips.design.view.stikers.ClipsStickersView.d
    public void d(MotionEvent motionEvent) {
        hyd hydVar = (hyd) this.c;
        hydVar.c.d().onTouch((View) hydVar.k.getValue(), motionEvent);
    }

    @Override // xsna.r2m
    public void g(com.vk.clips.sdk.shared.item.common.description.c cVar) {
        AdsItemViewEvent sz0Var;
        AdsItemViewEvent adsItemViewEvent;
        ux0 ux0Var = ((qx0) this.c).b;
        if (cVar instanceof c.b) {
            adsItemViewEvent = qz0.b;
        } else if (cVar instanceof c.a) {
            adsItemViewEvent = pz0.b;
        } else {
            if (cVar instanceof c.C0669c) {
                sz0Var = new rz0(((c.C0669c) cVar).a);
            } else if (cVar instanceof c.e) {
                sz0Var = new tz0(((c.e) cVar).a);
            } else {
                if (!(cVar instanceof c.d)) {
                    throw new NoWhenBranchMatchedException();
                }
                sz0Var = new sz0(((c.d) cVar).a);
            }
            adsItemViewEvent = sz0Var;
        }
        ux0Var.a(adsItemViewEvent);
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 3:
                break;
            case 9:
                break;
            case 14:
                CommunityGroupedNotificationsFragment communityGroupedNotificationsFragment = (CommunityGroupedNotificationsFragment) obj2;
                int i2 = CommunityGroupedNotificationsFragment.i0;
                if (!(obj instanceof CommunityGroupedNotificationsFragment.b) || ((CommunityGroupedNotificationsFragment.b) obj).a != communityGroupedNotificationsFragment.g0) {
                }
                break;
            case 15:
                break;
        }
        return ((Boolean) ((j9k) obj2).invoke(obj)).booleanValue();
    }

    public /* synthetic */ ox0(lfx lfxVar, zpa0 zpa0Var) {
        this.b = 22;
        this.c = zpa0Var;
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 1:
                return (com.vk.superapp.advertisement.a) ((u41) obj2).invoke(obj);
            case 2:
                return (List) ((ns1) obj2).invoke(obj);
            case 3:
            case 6:
            case 9:
            case 11:
            case 14:
            case 15:
            case 21:
            case 22:
            default:
                return (List) ((b4r) obj2).invoke(obj);
            case 4:
                return (wia0) ((uo3) obj2).invoke(obj);
            case 5:
                return (io.reactivex.rxjava3.core.t) ((ns1) obj2).invoke(obj);
            case 7:
                return (Boolean) ((ns1) obj2).invoke(obj);
            case 8:
                return (io.reactivex.rxjava3.core.t) ((w95) obj2).invoke(obj);
            case 10:
                return (io.reactivex.rxjava3.core.t) ((ns1) obj2).invoke(obj);
            case 12:
                return (io.reactivex.rxjava3.core.o) ((jm0) obj2).invoke(obj);
            case 13:
                return ((m3f) obj2).invoke(obj);
            case 16:
                return (io.reactivex.rxjava3.core.t) ((j9k) obj2).invoke(obj);
            case 17:
                return (io.reactivex.rxjava3.core.b0) ((bp7) obj2).invoke(obj);
            case 18:
                return (Boolean) ((b4r) obj2).invoke(obj);
            case 19:
                return (VKList) ((b4r) obj2).invoke(obj);
            case 20:
                return (String) ((b4r) obj2).invoke(obj);
            case 23:
                return (List) ((j9k) obj2).invoke(obj);
            case 24:
                return (io.reactivex.rxjava3.core.b0) ((j9k) obj2).invoke(obj);
            case 25:
                return (pr00) ((j9k) obj2).invoke(obj);
            case 26:
                int i2 = MasksWrap.e0;
                return (Mask) ((b4r) obj2).invoke(obj);
        }
    }
}
