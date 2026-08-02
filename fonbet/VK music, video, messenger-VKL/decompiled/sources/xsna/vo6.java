package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.vk.core.utils.VerifyInfoHelper;
import com.vk.core.view.PhotoStackView;
import com.vk.core.view.components.button.VkButton;
import com.vk.dto.common.VerifyInfo;
import com.vk.dto.group.Group;
import com.vk.dto.group.GroupLikes;
import com.vk.dto.group.GroupSuggestion;
import com.vk.dto.user.UserProfile;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;
import com.vkontakte.android.data.groups.FullSourceJoinApi;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: BaseSuggestedGroupHolder.kt */
/* loaded from: classes4.dex */
public abstract class vo6 extends vif0<GroupSuggestion> implements View.OnClickListener {
    public final View n;
    public final VKImageView o;
    public final TextView p;
    public final TextView q;
    public final TextView r;
    public final TextView s;
    public final View t;
    public final ImageView u;
    public final VkButton v;
    public final PhotoStackView w;
    public final ViewGroup x;
    public String y;
    public final q3n0 z;

    public vo6(int i, ViewGroup viewGroup) {
        super(viewGroup, i, 0);
        this.n = this.itemView.findViewById(R.id.card_container);
        VKImageView vKImageView = (VKImageView) this.itemView.findViewById(R.id.photo);
        this.o = vKImageView;
        this.p = (TextView) this.itemView.findViewById(R.id.name);
        this.q = (TextView) this.itemView.findViewById(R.id.subtitle);
        this.r = (TextView) this.itemView.findViewById(R.id.subtitle2);
        this.s = (TextView) this.itemView.findViewById(R.id.done);
        this.t = this.itemView.findViewById(R.id.icon);
        ImageView imageView = (ImageView) this.itemView.findViewById(R.id.button_hide);
        this.u = imageView;
        VkButton vkButton = (VkButton) this.itemView.findViewById(R.id.button);
        this.v = vkButton;
        PhotoStackView photoStackView = (PhotoStackView) this.itemView.findViewById(R.id.photo_strip);
        if (photoStackView != null) {
            photoStackView.setOverlapOffset(0.8f);
            photoStackView.setMarginBetweenImages(iah0.b(0.5f));
        } else {
            photoStackView = null;
        }
        this.w = photoStackView;
        this.x = (ViewGroup) this.itemView.findViewById(R.id.friends_layout);
        this.z = new q3n0(this, null, FullSourceJoinApi.EntryServiceType.FEED.i(), 22);
        dek0.b(vKImageView, null, null, 6);
        bwt0.h0(this, this.itemView);
        bwt0.h0(this, vkButton);
        bwt0.h0(this, imageView);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (epx.f(view, this.itemView)) {
            GroupSuggestion groupSuggestion = (GroupSuggestion) this.m;
            if (groupSuggestion != null) {
                this.z.e(groupSuggestion, this.y);
                return;
            }
            return;
        }
        if (!epx.f(view, this.v)) {
            epx.f(view, this.u);
            return;
        }
        GroupSuggestion groupSuggestion2 = (GroupSuggestion) this.m;
        this.z.b(groupSuggestion2, groupSuggestion2 != null ? groupSuggestion2.b : null, this.y, this.v, null);
    }

    public abstract int q6();

    @Override // xsna.vif0
    /* renamed from: s6, reason: merged with bridge method [inline-methods] */
    public void i6(GroupSuggestion groupSuggestion) {
        int i;
        ArrayList<UserProfile> arrayList;
        String str = groupSuggestion.c;
        Group group = groupSuggestion.b;
        this.o.load(new UserProfile(group).o(q6()));
        this.p.setText(group.d);
        VerifyInfo verifyInfo = group.y;
        boolean z = verifyInfo != null && verifyInfo.b;
        boolean z2 = verifyInfo != null && verifyInfo.c;
        View view = this.t;
        if (z || z2) {
            VerifyInfoHelper verifyInfoHelper = VerifyInfoHelper.a;
            view.setBackground(VerifyInfoHelper.f(this.l.getContext(), VerifyInfoHelper.ColorTheme.normal, new VerifyInfo(z, z2, false, false, false, false, 60, null)));
            view.setVisibility(0);
        } else {
            view.setVisibility(8);
        }
        GroupLikes groupLikes = group.T;
        if (groupLikes != null) {
            PhotoStackView photoStackView = this.w;
            if (photoStackView != null) {
                ArrayList<UserProfile> arrayList2 = groupLikes.e;
                ArrayList arrayList3 = new ArrayList(c5g.u(arrayList2, 10));
                Iterator<T> it = arrayList2.iterator();
                while (it.hasNext()) {
                    arrayList3.add(((UserProfile) it.next()).h);
                }
                photoStackView.r(2, arrayList3);
            }
            int i2 = groupLikes.d;
            String a6 = a6(R.plurals.friends_quantity, i2, uqm0.f(i2));
            TextView textView = this.r;
            if (textView != null) {
                textView.setText(a6);
            }
        }
        ViewGroup viewGroup = this.x;
        if (viewGroup != null) {
            GroupLikes groupLikes2 = group.T;
            bwt0.p0(viewGroup, (groupLikes2 == null || (arrayList = groupLikes2.e) == null || !(arrayList.isEmpty() ^ true)) ? false : true);
        }
        TextView textView2 = this.q;
        if (str == null || str.length() == 0) {
            i = 8;
        } else {
            textView2.setText(str);
            i = 0;
        }
        textView2.setVisibility(i);
        String H0 = hd60.a().H0(group);
        boolean e1 = hd60.a().e1(group.C);
        TextView textView3 = this.s;
        VkButton vkButton = this.v;
        if (e1) {
            textView3.setVisibility(0);
            vkButton.setVisibility(8);
            textView3.setText(H0);
        } else {
            textView3.setVisibility(8);
            vkButton.setVisibility(0);
            vkButton.setContentDescription(H0);
            vkButton.setText(H0);
        }
    }
}
