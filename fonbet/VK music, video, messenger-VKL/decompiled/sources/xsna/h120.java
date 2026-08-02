package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Source;
import com.vk.dto.common.id.UserId;
import com.vk.dto.common.im.ImageList;
import com.vk.im.ui.views.avatars.AvatarView;
import com.vkontakte.android.R;
import xsna.g1e0;

/* compiled from: MediaViewerControlsVc.kt */
/* loaded from: classes14.dex */
public final class h120 {
    public final q3v0 a;
    public final View b;
    public final AvatarView c;
    public final View d;
    public final TextView e;
    public final TextView f;
    public final View g;
    public final View h;
    public final View i;
    public final dn30 j;
    public a k;
    public io.reactivex.rxjava3.disposables.c l;
    public final int m;
    public final int n;

    /* compiled from: MediaViewerControlsVc.kt */
    public static final class a {
        public final UserId a;
        public final String b;
        public final String c;

        public a(UserId userId, String str, String str2) {
            this.a = userId;
            this.b = str;
            this.c = str2;
        }
    }

    public h120(ViewGroup viewGroup, q3v0 q3v0Var, boolean z) {
        this.a = q3v0Var;
        this.j = new dn30(viewGroup.getContext());
        this.m = (int) viewGroup.getResources().getDimension(R.dimen.go_to_msg_btn_margin_end);
        this.n = (int) viewGroup.getResources().getDimension(R.dimen.share_btn_margin_end);
        View b = s3j0.b(viewGroup, R.layout.media_owner_controlls, viewGroup, false);
        this.i = b;
        View findViewById = b.findViewById(R.id.owner_container);
        this.b = findViewById;
        AvatarView avatarView = (AvatarView) b.findViewById(R.id.vkim_avatar);
        this.c = avatarView;
        View findViewById2 = b.findViewById(R.id.vkim_name_container);
        this.d = findViewById2;
        this.e = (TextView) b.findViewById(R.id.vkim_name);
        this.f = (TextView) b.findViewById(R.id.vkim_date);
        View findViewById3 = b.findViewById(R.id.to_msg_btn);
        this.g = findViewById3;
        View findViewById4 = b.findViewById(R.id.vkim_share_btn);
        this.h = findViewById4;
        findViewById.setBackground(findViewById.getBackground());
        bwt0.b0(80, findViewById);
        bwt0.p0(findViewById3, z);
        bwt0.i0(avatarView, new cws(this, 20));
        bwt0.i0(findViewById2, new f410(this, 1));
        int i = 26;
        bwt0.i0(findViewById3, new zxo(this, i));
        bwt0.i0(findViewById4, new d9j(this, i));
        b.addOnAttachStateChangeListener(new i120(b, this));
    }

    public final void a(a aVar, String str) {
        TextView textView = this.f;
        String str2 = aVar.b;
        if (str2 == null || str2.length() == 0) {
            io.reactivex.rxjava3.disposables.c cVar = this.l;
            if (cVar != null) {
                cVar.dispose();
            }
            q3v0 q3v0Var = this.a;
            UserId userId = aVar.a;
            a1w a1wVar = q1w.a;
            a1w a1wVar2 = a1wVar != null ? a1wVar : null;
            g1e0.a aVar2 = new g1e0.a();
            aVar2.b = Source.ACTUAL;
            aVar2.a.c(com.vk.dto.common.a.a(userId));
            aVar2.c = true;
            io.reactivex.rxjava3.internal.operators.single.y l = a1wVar2.E(q3v0Var, new d1e0(new g1e0(aVar2))).l(new ao90(new du0(26, userId, q3v0Var), 10));
            rv rvVar = new rv(2, this, str);
            int i = kwg0.a;
            this.l = l.subscribe(rvVar, new jwg0("MediaViewerControlsVc"));
            return;
        }
        this.k = aVar;
        AvatarView avatarView = this.c;
        Serializer.c<ImageList> cVar2 = ImageList.CREATOR;
        ImageList c = ImageList.a.c(-1, -1, aVar.c);
        AvatarView.a aVar3 = AvatarView.y;
        avatarView.T0(c, null);
        this.e.setText(aVar.b);
        d3m.c(this.b, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        if (str == null || str.length() == 0) {
            d3m.b(textView, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 3);
            f4m.j(textView);
        } else {
            textView.setVisibility(0);
            textView.setText(str);
        }
    }

    public final void b(boolean z) {
        bwt0.p0(this.h, z);
        f4m.r(z ? this.m : this.n, this.g);
    }
}
