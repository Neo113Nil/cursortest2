package xsna;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.vk.dto.common.Peer;
import com.vk.dto.messages.HistoryAttachAction;
import com.vk.im.engine.models.attaches.HistoryAttach;
import com.vk.im.engine.models.attaches.MediaType;
import com.vk.im.engine.models.dialogs.ChatSettings;
import com.vk.im.ui.components.attaches_history.attaches.model.audio.AudioAttachListItem;
import java.util.List;
import xsna.js4;

/* compiled from: AudioAttachesComponent.kt */
/* loaded from: classes2.dex */
public final class jc4 extends c8v {
    public final Context t;
    public final js4 u;
    public final com.vk.im.ui.components.attaches_history.attaches.model.audio.b v;
    public final com.vk.im.ui.components.attaches_history.attaches.model.audio.a w;
    public final b x;

    /* compiled from: AudioAttachesComponent.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AudioAttachListItem.State.values().length];
            try {
                iArr[AudioAttachListItem.State.EMPTY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AudioAttachListItem.State.PLAYING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AudioAttachListItem.State.PAUSED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: AudioAttachesComponent.kt */
    public static final class b implements js4.a {
        public b() {
        }

        @Override // xsna.js4.a
        public final void a(xwv xwvVar) {
            com.vk.im.ui.components.attaches_history.attaches.model.audio.b bVar = jc4.this.v;
            pro0.a();
            bVar.a(xwvVar.f);
        }
    }

    public jc4(Context context, a1w a1wVar, mxv mxvVar, MediaType mediaType, Peer peer, js4 js4Var, kkm kkmVar, ChatSettings chatSettings) {
        super(context, peer, mediaType, chatSettings, kkmVar, mxvVar, a1wVar);
        this.t = context;
        this.u = js4Var;
        com.vk.im.ui.components.attaches_history.attaches.model.audio.b bVar = new com.vk.im.ui.components.attaches_history.attaches.model.audio.b();
        this.v = bVar;
        io.reactivex.rxjava3.subjects.d<com.vk.im.ui.components.attaches_history.attaches.model.audio.c> dVar = bVar.a;
        dVar.getClass();
        this.w = new com.vk.im.ui.components.attaches_history.attaches.model.audio.a(new io.reactivex.rxjava3.internal.operators.observable.y(dVar, io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a));
        this.x = new b();
    }

    @Override // xsna.c8v, xsna.j8i
    public final View L0(LayoutInflater layoutInflater, ViewGroup viewGroup, ViewStub viewStub, Bundle bundle) {
        View L0 = super.L0(layoutInflater, viewGroup, viewStub, bundle);
        js4 js4Var = this.u;
        js4Var.c();
        js4Var.e(this.x);
        this.v.a(js4Var.b());
        return L0;
    }

    @Override // xsna.c8v, xsna.txb, xsna.j8i
    public final void N0() {
        super.N0();
        b bVar = this.x;
        js4 js4Var = this.u;
        js4Var.d(bVar);
        this.v.b.dispose();
        js4Var.release();
    }

    @Override // xsna.c8v
    public final List<HistoryAttachAction> c1(HistoryAttach historyAttach) {
        HistoryAttachAction historyAttachAction = HistoryAttachAction.GO_TO_MSG;
        HistoryAttachAction historyAttachAction2 = HistoryAttachAction.SHARE;
        if (h1()) {
            historyAttachAction2 = null;
        }
        return rl3.I(new HistoryAttachAction[]{historyAttachAction, historyAttachAction2});
    }

    @Override // xsna.c8v
    public final l56 d1() {
        return this.w;
    }

    @Override // xsna.c8v
    public final f8v k1() {
        return new pp4(this.t, this, this.o);
    }
}
