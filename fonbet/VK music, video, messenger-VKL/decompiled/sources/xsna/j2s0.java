package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.util.Size;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.vk.dto.common.Peer;
import com.vk.dto.messages.HistoryAttachAction;
import com.vk.im.engine.models.attaches.AttachVideo;
import com.vk.im.engine.models.attaches.HistoryAttach;
import com.vk.im.engine.models.attaches.MediaType;
import com.vk.im.engine.models.dialogs.ChatSettings;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.cwb0;
import xsna.ikv0;
import xsna.tlo0;

/* compiled from: VideoAttachesComponent.kt */
/* loaded from: classes2.dex */
public final class j2s0 extends c8v {
    public final Context t;
    public final l2s0 u;
    public ips0 v;
    public final bpn0 w;

    /* compiled from: VideoAttachesComponent.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HistoryAttachAction.values().length];
            try {
                iArr[HistoryAttachAction.COPY_LINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HistoryAttachAction.GO_TO_MSG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[HistoryAttachAction.ADD_TO_ALBUM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[HistoryAttachAction.DELETE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[HistoryAttachAction.SHARE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[HistoryAttachAction.ADD.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[HistoryAttachAction.SAVE_TO_GALLERY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public j2s0(Context context, Peer peer, MediaType mediaType, ChatSettings chatSettings, kkm kkmVar, mxv mxvVar, a1w a1wVar) {
        super(context, peer, mediaType, chatSettings, kkmVar, mxvVar, a1wVar);
        this.t = context;
        this.u = new l2s0();
        this.w = new bpn0(new dbj0(this, 11));
    }

    @Override // xsna.j8i
    public final void K0(Configuration configuration) {
        int itemCount;
        ips0 ips0Var = this.v;
        if (ips0Var != null) {
            int i = configuration.orientation;
            if (ips0Var.c != null) {
                RecyclerView recyclerView = ips0Var.d;
                if (recyclerView == null) {
                    recyclerView = null;
                }
                RecyclerView.o layoutManager = recyclerView.getLayoutManager();
                if (layoutManager instanceof LinearLayoutManager) {
                    itemCount = ((LinearLayoutManager) layoutManager).v();
                } else if (layoutManager instanceof GridLayoutManager) {
                    itemCount = ((GridLayoutManager) layoutManager).v();
                } else if (layoutManager instanceof FlexboxLayoutManager) {
                    FlexboxLayoutManager flexboxLayoutManager = (FlexboxLayoutManager) layoutManager;
                    View y = flexboxLayoutManager.y(0, flexboxLayoutManager.getChildCount(), false);
                    itemCount = y == null ? -1 : flexboxLayoutManager.getPosition(y);
                } else {
                    itemCount = recyclerView.canScrollVertically(1) ? 0 : ips0Var.q.getItemCount();
                }
                RecyclerView recyclerView2 = ips0Var.d;
                if (recyclerView2 == null) {
                    recyclerView2 = null;
                }
                int d = (ips0Var.d(recyclerView2) + itemCount) / 2;
                RecyclerView recyclerView3 = ips0Var.d;
                if (recyclerView3 == null) {
                    recyclerView3 = null;
                }
                recyclerView3.setLayoutManager(ips0Var.i(i));
                RecyclerView recyclerView4 = ips0Var.d;
                (recyclerView4 != null ? recyclerView4 : null).scrollToPosition(d);
            }
        }
    }

    @Override // xsna.c8v
    public final List<HistoryAttachAction> c1(HistoryAttach historyAttach) {
        AttachVideo attachVideo = (AttachVideo) historyAttach.d;
        ArrayList arrayList = new ArrayList();
        arrayList.add(HistoryAttachAction.GO_TO_MSG);
        if (!h1()) {
            arrayList.add(HistoryAttachAction.SHARE);
            arrayList.add(HistoryAttachAction.COPY_LINK);
        }
        if (attachVideo.j() && !h1()) {
            arrayList.add(HistoryAttachAction.SAVE_TO_GALLERY);
        }
        boolean i9 = attachVideo.b.i9();
        a1w a1wVar = this.j;
        if (i9 && !o25.a().a(attachVideo.b.I0())) {
            a1wVar.r().getClass();
            arrayList.add(HistoryAttachAction.ADD);
        }
        if (attachVideo.b.i9()) {
            a1wVar.r().getClass();
            arrayList.add(HistoryAttachAction.ADD_TO_ALBUM);
        }
        if (attachVideo.b.t0()) {
            arrayList.add(HistoryAttachAction.DELETE);
        }
        return arrayList;
    }

    @Override // xsna.c8v
    public final l56 d1() {
        return this.u;
    }

    @Override // xsna.c8v
    public final void j1(HistoryAttachAction historyAttachAction, HistoryAttach historyAttach) {
        mxv mxvVar = this.k;
        Context context = this.t;
        AttachVideo attachVideo = (AttachVideo) historyAttach.d;
        switch (a.$EnumSwitchMapping$0[historyAttachAction.ordinal()]) {
            case 1:
                fvr.l(context, attachVideo.N4(a0a.d));
                tlo0.f h = tq.h(tlo0.Companion, R.string.vkim_link_copied);
                if (Build.VERSION.SDK_INT <= 32) {
                    ikv0.a aVar = new ikv0.a(context);
                    aVar.t = new ikv0.c.C3058c(R.drawable.vk_icon_check_circle_outline_28, Integer.valueOf(R.attr.vk_ui_icon_positive), (Size) null, 12);
                    aVar.u = new ikv0.d(new ikv0.d.c(tlo0.b.a(h, context).toString()), (ikv0.d.b) null, (ikv0.d.a) null, 6);
                    aVar.n();
                    return;
                }
                return;
            case 2:
                g1(historyAttach);
                return;
            case 3:
                mxvVar.l();
                Activity h2 = e3m.h(context);
                if (h2 != null) {
                    f1s0.a(h2, attachVideo.b, (r8 & 4) != 0, o25.a().c(), null, null);
                    return;
                }
                return;
            case 4:
                bzb0.d((bzb0) this.w.getValue(), cwb0.d1.l, new i4(18, this, attachVideo), null, null, 28);
                return;
            case 5:
                l1(historyAttach);
                return;
            case 6:
                io.reactivex.rxjava3.core.x n = hg1.n(this.j.F(this, new b0s0(attachVideo.getId(), attachVideo.b.I0())), this.l, false, null, 62);
                tk40 tk40Var = new tk40(new i2s0(0, this, attachVideo), 23);
                ips0 ips0Var = this.v;
                I0(n.subscribe(tk40Var, new wx00(new xv2(1, ips0Var == null ? null : ips0Var, ips0.class, "showError", "showError(Ljava/lang/Throwable;)V", 0, 16), 26)));
                return;
            case 7:
                mxvVar.l().a(this.l, attachVideo);
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @Override // xsna.c8v
    public final f8v k1() {
        ips0 ips0Var = new ips0(this.t, this, this.o);
        this.v = ips0Var;
        return ips0Var;
    }
}
