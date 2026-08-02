package com.yandex.messaging.ui.reactions;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.x0;
import com.yandex.images.FadingDrawable;
import com.yandex.messaging.core.net.entities.proto.message.ReducedUserInfo;
import com.yandex.messaging.internal.avatar.AvatarImageView;
import defpackage.ad7;
import defpackage.ai91;
import defpackage.arg;
import defpackage.e9h0;
import defpackage.g020;
import defpackage.hb4;
import defpackage.ike;
import defpackage.kjs0;
import defpackage.ny61;
import defpackage.pzt0;
import defpackage.rp21;
import defpackage.tls;
import defpackage.ugd0;
import defpackage.xav;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes15.dex */
public final class b extends x0 {
    public final com.yandex.messaging.internal.avatar.a N;
    public final ike O;
    public final String P;
    public final arg Q;
    public final xav R;
    public final rp21 S;
    public final tls T;
    public final AvatarImageView U;
    public final TextView V;
    public final ImageView W;
    public final TextView Z;
    public final int a0;
    public final int b0;
    public pzt0 c0;

    public b(View view, com.yandex.messaging.internal.avatar.a aVar, ike ikeVar, String str, arg argVar, xav xavVar, rp21 rp21Var, ugd0 ugd0Var) {
        super(view);
        this.N = aVar;
        this.O = ikeVar;
        this.P = str;
        this.Q = argVar;
        this.R = xavVar;
        this.S = rp21Var;
        this.T = ugd0Var;
        AvatarImageView avatarImageView = (AvatarImageView) view.findViewById(e9h0.user_avatar);
        this.U = avatarImageView;
        TextView textView = (TextView) view.findViewById(e9h0.user_name);
        this.V = textView;
        this.W = (ImageView) view.findViewById(e9h0.reaction_image);
        this.Z = (TextView) view.findViewById(e9h0.reaction_date_text);
        this.a0 = kjs0.b(48);
        this.b0 = kjs0.b(24);
        ai91.f(avatarImageView, false);
        ai91.f(textView, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object W(b bVar, ReducedUserInfo reducedUserInfo, ContinuationImpl continuationImpl) {
        PublicReactionViewHolder$loadAvatar$1 publicReactionViewHolder$loadAvatar$1;
        int i;
        bVar.getClass();
        if (continuationImpl instanceof PublicReactionViewHolder$loadAvatar$1) {
            publicReactionViewHolder$loadAvatar$1 = (PublicReactionViewHolder$loadAvatar$1) continuationImpl;
            int i2 = publicReactionViewHolder$loadAvatar$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                publicReactionViewHolder$loadAvatar$1.label = i2 - Integer.MIN_VALUE;
                Object obj = publicReactionViewHolder$loadAvatar$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = publicReactionViewHolder$loadAvatar$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    String str = reducedUserInfo.avatarId;
                    int i3 = bVar.a0;
                    String str2 = reducedUserInfo.displayName;
                    if (str2 == null) {
                        str2 = "";
                    }
                    String str3 = reducedUserInfo.userId;
                    g020 g020Var = new g020(com.yandex.messaging.internal.images.b.f(str), i3, str2, str3, hb4.a);
                    com.yandex.messaging.internal.avatar.a aVar = bVar.N;
                    publicReactionViewHolder$loadAvatar$1.L$0 = bVar;
                    publicReactionViewHolder$loadAvatar$1.label = 1;
                    obj = aVar.b(g020Var, publicReactionViewHolder$loadAvatar$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    bVar = (b) publicReactionViewHolder$loadAvatar$1.L$0;
                    kotlin.b.b(obj);
                }
                ad7 ad7Var = (ad7) obj;
                FadingDrawable.setBitmap(bVar.U, ad7Var.a, false, ad7Var.d);
                return zy11.a;
            }
        }
        publicReactionViewHolder$loadAvatar$1 = new PublicReactionViewHolder$loadAvatar$1(bVar, continuationImpl);
        Object obj2 = publicReactionViewHolder$loadAvatar$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = publicReactionViewHolder$loadAvatar$1.label;
        if (i != 0) {
        }
        ad7 ad7Var2 = (ad7) obj2;
        FadingDrawable.setBitmap(bVar.U, ad7Var2.a, false, ad7Var2.d);
        return zy11.a;
    }
}
