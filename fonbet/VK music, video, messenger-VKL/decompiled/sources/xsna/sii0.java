package xsna;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.ViewGroup;
import android.widget.TextView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.messages.dto.MessagesConversationPeerTypeDto;
import com.vk.dto.common.id.UserId;
import com.vk.imageloader.view.VKCircleImageView;
import com.vk.sharing.core.view.TargetSendActionView;
import com.vkontakte.android.R;
import xsna.nii0;
import xsna.uii0;

/* compiled from: SendStoryUsersDialogDelegate.kt */
/* loaded from: classes16.dex */
public final class sii0 extends p1u0<uii0.b> {
    public final q99 a;
    public final msj0 b;

    /* compiled from: SendStoryUsersDialogDelegate.kt */
    public static final class a extends vfz<uii0.b> {
        public final izs<nii0, s3q0> l;
        public final msj0 m;
        public final VKCircleImageView n;
        public final TextView o;
        public final TargetSendActionView p;
        public uii0.b q;

        /* compiled from: SendStoryUsersDialogDelegate.kt */
        /* renamed from: xsna.sii0$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C3668a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[TargetSendActionView.State.values().length];
                try {
                    iArr[TargetSendActionView.State.SEND.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[TargetSendActionView.State.OPEN.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[TargetSendActionView.State.CANCEL.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public a(ViewGroup viewGroup, q99 q99Var, msj0 msj0Var) {
            super(R.layout.layout_story_send_dialog, viewGroup);
            this.l = q99Var;
            this.m = msj0Var;
            this.n = (VKCircleImageView) this.itemView.findViewById(R.id.dialog_photo);
            this.o = (TextView) this.itemView.findViewById(R.id.dialog_title);
            TargetSendActionView targetSendActionView = (TargetSendActionView) this.itemView.findViewById(R.id.dialog_btn_send);
            this.p = targetSendActionView;
            targetSendActionView.setOnClickListener(new fod0(this, targetSendActionView, 1));
            targetSendActionView.setColorAccent(targetSendActionView.getContext().getColor(R.color.vk_white));
        }

        @Override // xsna.vfz
        /* renamed from: W5 */
        public final void i6(uii0.b bVar) {
            Drawable drawable;
            uii0.b bVar2 = bVar;
            this.q = bVar2;
            s8m s8mVar = bVar2.b;
            String str = s8mVar.b;
            String str2 = s8mVar.b;
            this.o.setText(str);
            UserId userId = s8mVar.a;
            a4o0 a4o0Var = new a4o0(false, userId, false);
            TargetSendActionView.State state = s8mVar.f;
            int i = TargetSendActionView.j;
            TargetSendActionView targetSendActionView = this.p;
            targetSendActionView.b(a4o0Var, state, null);
            int i2 = C3668a.$EnumSwitchMapping$0[state.ordinal()];
            if (i2 == 1) {
                targetSendActionView.getClass();
                targetSendActionView.post(new jk9(targetSendActionView, 12));
            } else if (i2 == 3) {
                targetSendActionView.getClass();
                targetSendActionView.post(new luj0(targetSendActionView, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1));
            }
            MessagesConversationPeerTypeDto messagesConversationPeerTypeDto = s8mVar.e;
            MessagesConversationPeerTypeDto messagesConversationPeerTypeDto2 = MessagesConversationPeerTypeDto.CHAT;
            msj0 msj0Var = this.m;
            if (messagesConversationPeerTypeDto == messagesConversationPeerTypeDto2) {
                drawable = msj0Var.b(this.itemView.getContext(), userId.b, str2);
            } else if (messagesConversationPeerTypeDto == MessagesConversationPeerTypeDto.CONTACT) {
                drawable = msj0Var.a(this.itemView.getContext(), str2);
            } else if (s8mVar.d) {
                LayerDrawable layerDrawable = (LayerDrawable) m33.a(R.drawable.bg_slef_dialog, this.itemView.getContext());
                layerDrawable.findDrawableByLayerId(R.id.bookmark_outline_20).setTint(this.itemView.getContext().getColor(R.color.vk_white));
                drawable = layerDrawable;
            } else {
                drawable = null;
            }
            VKCircleImageView vKCircleImageView = this.n;
            vKCircleImageView.setEmptyImagePlaceholder(drawable);
            vKCircleImageView.o0(s8mVar.c, null);
        }

        @Override // xsna.vfz
        public final void a6() {
            uii0.b bVar;
            s8m s8mVar;
            UserId userId;
            if (this.p.getCurrentState() != TargetSendActionView.State.CANCEL || (bVar = this.q) == null || (s8mVar = bVar.b) == null || (userId = s8mVar.a) == null) {
                return;
            }
            this.l.invoke(new nii0.i(userId.b, TargetSendActionView.State.SEND));
        }
    }

    public sii0(q99 q99Var, msj0 msj0Var) {
        this.a = q99Var;
        this.b = msj0Var;
    }

    @Override // xsna.p1u0
    public final vfz<? extends uii0.b> b(ViewGroup viewGroup) {
        return new a(viewGroup, this.a, this.b);
    }

    @Override // xsna.p1u0
    public final boolean c(hfz hfzVar) {
        return hfzVar instanceof uii0.b;
    }
}
