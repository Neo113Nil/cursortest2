package xsna;

import android.view.MotionEvent;
import android.view.View;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockFilter2D;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.dto.ui.UIBlockVideo;
import com.vk.catalog2.common.dto.ui.UIBlockVideoAlbum;
import com.vk.catalog2.common.ui.mvp.video.albumbottomsheet.VideoAlbumActionItem;
import com.vk.dto.common.VideoFile;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.im.engine.models.groups.ManagedGroup;
import com.vk.lists.CustomSwipeRefreshLayout;
import com.vk.voip.ui.change_name.VoipChangeNameConfig;
import com.vk.voip.ui.history.friends.ui.VoipHistoryFriendsFragment;
import com.vk.voip.ui.history.friends.ui.b;
import com.vungle.ads.internal.protos.Sdk;
import io.reactivex.rxjava3.internal.functions.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.text.Regex;
import xsna.a7f0;
import xsna.amw0;
import xsna.atq0;
import xsna.iyq0;
import xsna.qfo0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class r5i0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ r5i0(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0173 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01e5 A[ADDED_TO_REGION, SYNTHETIC] */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        ArrayList<UIBlock> arrayList;
        String str;
        boolean z;
        ArrayList<UIBlock> arrayList2;
        boolean z2;
        switch (this.b) {
            case 0:
                ((tdu) obj).o(((azl) this.c).I0(((pco) ((mtk0) this.d).getValue()).b));
                return s3q0.a;
            case 1:
                ((ctl0) this.c).b.e(108, (StoryEntry) this.d);
                return s3q0.a;
            case 2:
                sul0 sul0Var = (sul0) this.c;
                List<? extends StoryEntry> list = (List) this.d;
                if (((Boolean) obj).booleanValue()) {
                    sul0Var.c.f(list);
                    List<? extends StoryEntry> list2 = list;
                    if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                        Iterator<T> it = list2.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (((StoryEntry) it.next()).R != null) {
                                    ((jfm0) sul0Var.e.getValue()).n(list);
                                }
                            }
                        }
                    }
                    sul0Var.b.e(100, list);
                }
                return s3q0.a;
            case 3:
                okhttp3.v vVar = (okhttp3.v) obj;
                return ((b0m0) this.c).b((String) this.d, vVar.contentLength(), vVar.byteStream());
            case 4:
                j3n0 j3n0Var = (j3n0) this.c;
                View view = (View) this.d;
                MotionEvent motionEvent = (MotionEvent) obj;
                view.getBackground().setHotspot(motionEvent.getX(), motionEvent.getY());
                view.setPressed(false);
                View view2 = j3n0Var.d;
                if (view2 != null) {
                    view2.postDelayed(j3n0Var.m, 6000L);
                }
                return s3q0.a;
            case 5:
                androidx.compose.ui.graphics.d.c((oio) obj, (androidx.compose.ui.graphics.c) this.c, ((qfo0.a) this.d).a(), null, 60);
                return s3q0.a;
            case 6:
                w2w w2wVar = (w2w) this.c;
                l8q0 l8q0Var = (l8q0) this.d;
                ManagedGroup b = w2wVar.I0().l().b(l8q0Var.b.d);
                if (b == null) {
                    return s3q0.a;
                }
                w2wVar.I0().l().d(ManagedGroup.a(b, false, l8q0Var.c, 383));
                return s3q0.a;
            case 7:
                btq0 btq0Var = (btq0) this.c;
                atq0.a aVar = (atq0.a) this.d;
                ((ikv0) obj).a();
                btq0Var.b.a(aVar.c);
                return s3q0.a;
            case 8:
                hyq0 hyq0Var = (hyq0) this.c;
                izs izsVar = (izs) this.d;
                hyq0Var.T(iyq0.e.b);
                if (izsVar != null) {
                    izsVar.invoke(Boolean.FALSE);
                }
                return s3q0.a;
            case 9:
                izs izsVar2 = (izs) this.c;
                gzs gzsVar = (gzs) this.d;
                izsVar2.invoke((VideoAlbumActionItem) obj);
                gzsVar.invoke();
                return s3q0.a;
            case 10:
                dks0 dks0Var = (dks0) this.c;
                wxr0 wxr0Var = (wxr0) this.d;
                UIBlockList uIBlockList = (UIBlockList) obj;
                wot0 wot0Var = dks0Var.d;
                String str2 = uIBlockList.M;
                wot0Var.getClass();
                Regex regex = new Regex(".+/(vk)?video.*/my");
                boolean z3 = false;
                if (str2 != null && regex.f(str2)) {
                    VideoFile videoFile = wxr0Var.a;
                    ArrayList<UIBlock> arrayList3 = uIBlockList.y;
                    if (arrayList3 == null || !arrayList3.isEmpty()) {
                        for (UIBlock uIBlock : arrayList3) {
                            if (!(uIBlock instanceof UIBlockVideoAlbum) || ((UIBlockVideoAlbum) uIBlock).y.f <= 0) {
                                if ((uIBlock instanceof UIBlockList) && ((arrayList2 = ((UIBlockList) uIBlock).y) == null || !arrayList2.isEmpty())) {
                                    for (UIBlock uIBlock2 : arrayList2) {
                                        if (!(uIBlock2 instanceof UIBlockVideoAlbum) || ((UIBlockVideoAlbum) uIBlock2).y.f <= 0) {
                                        }
                                    }
                                }
                                z = false;
                                if (uIBlock instanceof UIBlockVideo) {
                                    UIBlockVideo uIBlockVideo = (UIBlockVideo) uIBlock;
                                    String str3 = uIBlockVideo.K;
                                    wot0Var.getClass();
                                    if (wot0.a(str3) && epx.f(videoFile.a1(), uIBlockVideo.B.a1())) {
                                        z2 = true;
                                        if (!z && !z2) {
                                        }
                                        z3 = true;
                                    }
                                }
                                z2 = false;
                                if (!z) {
                                }
                                z3 = true;
                            }
                            z = true;
                            if (uIBlock instanceof UIBlockVideo) {
                            }
                            z2 = false;
                            if (!z) {
                            }
                            z3 = true;
                        }
                    }
                } else if (fxc0.B().J().g() && (str = uIBlockList.M) != null && drm0.D(str, "history", false)) {
                    z3 = uIBlockList.y.isEmpty();
                } else if (fxc0.B().J().Z1() && ((arrayList = uIBlockList.y) == null || !arrayList.isEmpty())) {
                    Iterator<T> it2 = arrayList.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (((UIBlock) it2.next()) instanceof UIBlockFilter2D) {
                                ArrayList<UIBlock> arrayList4 = uIBlockList.y;
                                if (arrayList4 == null || !arrayList4.isEmpty()) {
                                    Iterator<T> it3 = arrayList4.iterator();
                                    while (it3.hasNext()) {
                                        if (((UIBlock) it3.next()) instanceof UIBlockVideo) {
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return Boolean.valueOf(z3);
            case 11:
                vlw0 vlw0Var = (vlw0) this.c;
                String str4 = (String) this.d;
                if (((Boolean) obj).booleanValue()) {
                    vlw0Var.T(amw0.b.a.b);
                    jsa jsaVar = vlw0Var.h;
                    qaj0.c(jsaVar.b.c(), "changed_name", str4);
                    VoipChangeNameConfig voipChangeNameConfig = vlw0Var.f;
                    VoipChangeNameConfig.OpenedFrom openedFrom = voipChangeNameConfig.i;
                    if (openedFrom instanceof VoipChangeNameConfig.OpenedFrom.JoinScreen) {
                        vlw0Var.k.b(vlw0Var.V(str4));
                    } else {
                        if (!(openedFrom instanceof VoipChangeNameConfig.OpenedFrom.ActiveCall)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        io.reactivex.rxjava3.internal.operators.completable.w g = rsg0.Z(yfb.x(qd9.c(jsaVar.a, voipChangeNameConfig.b.b, str4, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE))).g(new isa(0, jsaVar, str4));
                        gyq0 gyq0Var = new gyq0(new lxh0(vlw0Var, 19), 5);
                        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
                        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
                        io.reactivex.rxjava3.internal.operators.completable.h hVar = new io.reactivex.rxjava3.internal.operators.completable.h(new io.reactivex.rxjava3.internal.operators.completable.w(g, gyq0Var, lVar, kVar, kVar, kVar, kVar), new rcl(vlw0Var, 4));
                        asu0 asu0Var = asu0.a;
                        a7f0.a.d(vlw0Var, hVar.q(asu0Var.c()).o(asu0Var.d()), null, new hfm0(vlw0Var, 23), new xm6(19, vlw0Var, str4), 1);
                    }
                } else {
                    vlw0Var.T(amw0.b.c.b);
                }
                return s3q0.a;
            default:
                VoipHistoryFriendsFragment voipHistoryFriendsFragment = (VoipHistoryFriendsFragment) this.c;
                CustomSwipeRefreshLayout customSwipeRefreshLayout = (CustomSwipeRefreshLayout) this.d;
                b.c cVar = (b.c) obj;
                voipHistoryFriendsFragment.R.setItems(cVar.a);
                customSwipeRefreshLayout.setRefreshing(cVar.b);
                return s3q0.a;
        }
    }
}
