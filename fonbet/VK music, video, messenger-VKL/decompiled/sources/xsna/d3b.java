package xsna;

import android.content.Context;
import com.vk.im.ui.components.common.LinkAction;
import com.vk.toggle.features.ImFeatures;
import xsna.cwb0;

/* compiled from: ChannelMessagesLinkLongClickHandler.kt */
/* loaded from: classes16.dex */
public final class d3b {
    public final Context a;
    public final bzb0 b;
    public final com.vk.im.popup.a c;
    public final pf20 d;
    public final f1b e;
    public final e1b f;
    public final l3b g;
    public final io.reactivex.rxjava3.disposables.b h;
    public final long i;

    /* compiled from: ChannelMessagesLinkLongClickHandler.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LinkAction.values().length];
            try {
                iArr[LinkAction.OPEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LinkAction.COPY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LinkAction.EMAIL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LinkAction.CALL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public d3b(Context context, bzb0 bzb0Var, com.vk.im.popup.a aVar, pf20 pf20Var, f1b f1bVar, iza izaVar, l3b l3bVar, io.reactivex.rxjava3.disposables.b bVar, long j) {
        this.a = context;
        this.b = bzb0Var;
        this.c = aVar;
        this.d = pf20Var;
        this.e = f1bVar;
        this.f = izaVar;
        this.g = l3bVar;
        this.h = bVar;
        this.i = j;
    }

    public static final void a(d3b d3bVar) {
        d3bVar.getClass();
        ImFeatures imFeatures = ImFeatures.IM_CHAT_MODALS_REDESIGN;
        imFeatures.getClass();
        if (com.vk.toggle.b.A.a(imFeatures)) {
            d3bVar.c.dismiss();
        } else {
            d3bVar.b.a();
        }
    }

    public final void b(String str) {
        cwb0.i0 i0Var = new cwb0.i0(e43.l(LinkAction.CALL, LinkAction.COPY));
        c3b c3bVar = new c3b(this, this.a, str, 0);
        ImFeatures imFeatures = ImFeatures.IM_CHAT_MODALS_REDESIGN;
        imFeatures.getClass();
        if (!com.vk.toggle.b.A.a(imFeatures)) {
            this.b.b(i0Var, c3bVar, new i3b(0, this, d3b.class, "dismissPopup", "dismissPopup()V", 0, 0));
            return;
        }
        this.c.c(gwb0.a(i0Var), c3bVar, new h3b(0, this, d3b.class, "dismissPopup", "dismissPopup()V", 0, 0));
    }
}
