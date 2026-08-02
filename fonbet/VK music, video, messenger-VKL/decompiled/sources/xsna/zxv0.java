package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.ui.image.VKImageController;
import com.vk.external.miniapp.net.app.WebImageSize;
import com.vk.lists.ListDataSet;
import com.vk.superapp.api.dto.user.WebUserShortInfo;
import com.vk.superapp.browser.internal.ui.friends.VkFriendsPickerActivity;
import com.vkontakte.android.R;
import java.util.LinkedHashSet;

/* compiled from: VkUserListAdapter.kt */
/* loaded from: classes6.dex */
public final class zxv0 extends zoj0<jtx, mvx<?>> {
    public final VkFriendsPickerActivity.b e;
    public boolean f;
    public final LinkedHashSet g;

    /* compiled from: VkUserListAdapter.kt */
    public final class a extends mvx<lkq0> {
        public final r9c0 l;
        public final TextView m;
        public final CheckBox n;
        public final VKImageController<View> o;
        public final VKImageController.b p;
        public WebUserShortInfo q;

        public a(ViewGroup viewGroup, r9c0 r9c0Var) {
            super(tf3.b(viewGroup, R.layout.vk_friend_item, viewGroup, false));
            this.l = r9c0Var;
            this.m = (TextView) this.itemView.findViewById(R.id.name);
            FrameLayout frameLayout = (FrameLayout) this.itemView.findViewById(R.id.icon_container);
            CheckBox checkBox = (CheckBox) this.itemView.findViewById(R.id.checkbox);
            this.n = checkBox;
            ifx0 ifx0Var = e370.c;
            VKImageController<View> create = (ifx0Var == null ? null : ifx0Var).b().create(this.itemView.getContext());
            this.o = create;
            this.p = new VKImageController.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, true, 0, null, null, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, null, null, null, 65531);
            if (zxv0.this.f) {
                checkBox.setVisibility(0);
            } else {
                f4m.j(checkBox);
            }
            this.itemView.setOnClickListener(new com.vk.im.video.d(this, 15));
            frameLayout.addView(((com.vk.core.ui.image.c) create).getView());
        }

        @Override // xsna.mvx
        public final void V5(lkq0 lkq0Var) {
            WebUserShortInfo webUserShortInfo = lkq0Var.a;
            this.q = webUserShortInfo;
            this.m.setText(webUserShortInfo.d());
            WebImageSize e = webUserShortInfo.h.e(200);
            this.o.f(e != null ? e.b : null, this.p);
            this.n.setChecked(zxv0.this.g.contains(webUserShortInfo.b));
        }
    }

    /* compiled from: VkUserListAdapter.kt */
    public static final class b extends mvx<i2z> {
        @Override // xsna.mvx
        public final void V5(i2z i2zVar) {
            ((TextView) this.itemView).setText(String.valueOf(i2zVar.a));
        }
    }

    public zxv0(ListDataSet listDataSet, VkFriendsPickerActivity.b bVar) {
        super(listDataSet);
        this.e = bVar;
        this.g = new LinkedHashSet();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        jtx jtxVar = (jtx) this.c.c(i);
        if (jtxVar instanceof i2z) {
            return 0;
        }
        if (jtxVar instanceof lkq0) {
            return 1;
        }
        throw new IllegalStateException("Unknown item of class ".concat(jtxVar.getClass().getSimpleName()));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        ((mvx) e0Var).V5((jtx) this.c.c(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 0) {
            return new b(tf3.b(viewGroup, R.layout.vk_friend_first_letter_item, viewGroup, false));
        }
        if (i == 1) {
            return new a(viewGroup, new r9c0(this, 26));
        }
        throw new IllegalStateException(lhg.a(i, "Unknown viewType = "));
    }
}
