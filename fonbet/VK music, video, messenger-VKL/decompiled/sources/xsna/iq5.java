package xsna;

import android.graphics.RectF;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.ironsource.X3;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vk.core.view.components.p003switch.VkSwitchItem;
import com.vk.dto.common.id.UserId;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;
import xsna.ikv0;
import xsna.mut0;

/* compiled from: AvatarChangePublishFragment.kt */
/* loaded from: classes15.dex */
public final class iq5 extends Fragment implements View.OnClickListener {
    public VKImageView i;
    public VkSwitchItem j;
    public int l;
    public int m;
    public boolean o;
    public final RectF h = new RectF();
    public String k = "";
    public UserId n = UserId.d;
    public final wh50 p = androidx.compose.runtime.k.b(Boolean.TRUE);
    public final wh50 q = androidx.compose.runtime.k.b(Boolean.FALSE);
    public final Object r = msy.a(LazyThreadSafetyMode.NONE, new gy0(this, 6));

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z;
        int i;
        Integer valueOf = view != null ? Integer.valueOf(view.getId()) : null;
        if (valueOf != null && valueOf.intValue() == R.id.avatar_publish_back_btn) {
            kn().onBackPressed();
            return;
        }
        if (valueOf != null && valueOf.intValue() == R.id.avatar_publish_continue) {
            VkSwitchItem vkSwitchItem = this.j;
            if (vkSwitchItem == null) {
                vkSwitchItem = null;
            }
            boolean z2 = false;
            if (bwt0.K(vkSwitchItem)) {
                VkSwitchItem vkSwitchItem2 = this.j;
                if (vkSwitchItem2 == null) {
                    vkSwitchItem2 = null;
                }
                if (vkSwitchItem2.b.isChecked()) {
                    z = true;
                    if (!fkq0.b(this.n) && ((Boolean) ((zak0) this.p).getValue()).booleanValue()) {
                        z2 = true;
                    }
                    i = this.l;
                    int i2 = this.m;
                    if (i > 400 || i >= 8192 || i2 <= 400 || i2 >= 8192) {
                        ikv0.a aVar = new ikv0.a(requireContext());
                        aVar.u = new ikv0.d(getString(R.string.wrong_avatar_size), (String) null, (ikv0.d.a) null, 6);
                        aVar.n();
                    } else {
                        gq5 gq5Var = (gq5) kn();
                        int i3 = this.l;
                        int i4 = this.m;
                        RectF rectF = this.h;
                        gq5Var.r0(z, z2, new br5(rectF.left, rectF.top, rectF.right, rectF.bottom, i3, i4));
                        return;
                    }
                }
            }
            z = false;
            if (!fkq0.b(this.n)) {
                z2 = true;
            }
            i = this.l;
            int i22 = this.m;
            if (i > 400) {
            }
            ikv0.a aVar2 = new ikv0.a(requireContext());
            aVar2.u = new ikv0.d(getString(R.string.wrong_avatar_size), (String) null, (ikv0.d.a) null, 6);
            aVar2.n();
        }
    }

    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.h.set(requireArguments.getFloat(TtmlNode.LEFT), requireArguments.getFloat("top"), requireArguments.getFloat(TtmlNode.RIGHT), requireArguments.getFloat("bottom"));
        this.l = requireArguments.getInt("width");
        this.m = requireArguments.getInt("height");
        String string = requireArguments.getString(X3.i.b);
        if (string == null) {
            string = "";
        }
        this.k = string;
        UserId userId = (UserId) requireArguments.getParcelable("uid");
        if (userId == null) {
            userId = UserId.d;
        }
        this.n = userId;
        this.o = requireArguments.getBoolean("skip_avatar_publish", false);
        aqw.o((q7v0) this.r.getValue(), "story:repost:change_avatar", new com.vk.movika.tools.controls.seekbar.q(this, 1));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        dhr0.a.getClass();
        View inflate = LayoutInflater.from(dhr0.q0(dhr0.u().c)).inflate(R.layout.fragment_avatar_change_publish, viewGroup, false);
        jjc.f(this, inflate.findViewById(R.id.avatar_publish_back_btn));
        jjc.f(this, inflate.findViewById(R.id.avatar_publish_continue));
        this.i = (VKImageView) inflate.findViewById(R.id.avatar_publish_image);
        int i = this.l;
        int i2 = this.m;
        if (i * i2 != 0) {
            tn(i, i2);
        }
        VkSwitchItem vkSwitchItem = (VkSwitchItem) inflate.findViewById(R.id.avatar_publish_post_switch);
        vkSwitchItem.setChecked(true);
        bwt0.p0(vkSwitchItem, !this.o);
        vkSwitchItem.setAlignSwitchToEnd(true);
        vkSwitchItem.setListener(new l4(this, 6));
        this.j = vkSwitchItem;
        ComposeView composeView = (ComposeView) inflate.findViewById(R.id.avatar_publish_story_cell);
        bwt0.p0(composeView, !fkq0.b(this.n));
        composeView.setViewCompositionStrategy(mut0.c.a);
        composeView.setContent(new jai(1159756348, new hq5(this, 0), true));
        ((TextView) inflate.findViewById(R.id.avatar_publish_subtitle)).setText(fkq0.b(this.n) ? R.string.avatar_crop_subtitle : R.string.avatar_publish_subtitle);
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        getViewLifecycleOwner().getLifecycle().addObserver(new uer0(mcr0.h(Uri.parse(this.k)).U(new h8(new ul1(this, 7), 6)).r0(asu0.a.c()).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new gn0(new qu(this, 5), 4), new bg1(new j60(3), 4))));
    }

    public final void tn(int i, int i2) {
        VKImageView vKImageView = this.i;
        if (vKImageView == null) {
            vKImageView = null;
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) vKImageView.getLayoutParams();
        VKImageView vKImageView2 = this.i;
        if (vKImageView2 == null) {
            vKImageView2 = null;
        }
        int min = Math.min(vKImageView2.getMaxWidth(), (iah0.f().widthPixels - bVar.getMarginStart()) - bVar.getMarginEnd());
        VKImageView vKImageView3 = this.i;
        if (vKImageView3 == null) {
            vKImageView3 = null;
        }
        int min2 = Math.min(min, vKImageView3.getMaxHeight());
        VKImageView vKImageView4 = this.i;
        if (vKImageView4 == null) {
            vKImageView4 = null;
        }
        ((ViewGroup.MarginLayoutParams) bVar).width = xwk.b(i, vKImageView4.getMinimumWidth(), min2);
        VKImageView vKImageView5 = this.i;
        ((ViewGroup.MarginLayoutParams) bVar).height = xwk.b(i2, (vKImageView5 != null ? vKImageView5 : null).getMinimumHeight(), min2);
        this.l = i;
        this.m = i2;
    }
}
