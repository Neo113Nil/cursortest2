package xsna;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.view.ViewGroup;
import com.vk.core.view.components.cell.VkMiniInfoCell;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.user.UserProfile;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import org.chromium.net.NetError;
import xsna.h7u0;
import xsna.tlo0;

/* compiled from: CommunityMembersItem.kt */
/* loaded from: classes5.dex */
public final class mah extends we6 {
    public final nah g;
    public final on h;
    public final int i = NetError.ERR_CERT_CONTAINS_ERRORS;

    /* compiled from: CommunityMembersItem.kt */
    public static final class a extends vif0<mah> {
        public static final /* synthetic */ int o = 0;
        public final VkMiniInfoCell n;

        public a(VkMiniInfoCell vkMiniInfoCell) {
            super(vkMiniInfoCell);
            this.n = (VkMiniInfoCell) this.itemView;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0091  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0098  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0113  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x0183  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x0186  */
        /* JADX WARN: Removed duplicated region for block: B:62:0x01b5  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x00a6  */
        /* JADX WARN: Removed duplicated region for block: B:68:0x0093  */
        /* JADX WARN: Type inference failed for: r4v14, types: [kotlin.collections.EmptyList] */
        /* JADX WARN: Type inference failed for: r4v15 */
        /* JADX WARN: Type inference failed for: r4v24, types: [java.util.ArrayList] */
        @Override // xsna.vif0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void i6(mah mahVar) {
            String str;
            SpannableString spannableString;
            int i;
            CharSequence charSequence;
            Collection collection;
            boolean isEmpty;
            Iterable iterable;
            VkMiniInfoCell.f fVar;
            List<UserProfile> list;
            ImageSize Cb;
            String str2;
            mah mahVar2 = mahVar;
            VkMiniInfoCell.Mode mode = VkMiniInfoCell.Mode.BaseAccent;
            VkMiniInfoCell vkMiniInfoCell = this.n;
            vkMiniInfoCell.setMode(mode);
            nah nahVar = mahVar2.g;
            List<UserProfile> list2 = nahVar.f;
            boolean z = nahVar.g;
            if (list2 == null || list2.isEmpty()) {
                str = "";
            } else {
                StringBuilder sb = new StringBuilder();
                int size = list2.size();
                if (size > 3) {
                    size = 3;
                }
                for (int i2 = 0; i2 < size; i2++) {
                    sb.append(list2.get(i2).e);
                }
                str = sb.toString();
            }
            vkMiniInfoCell.setContentDescription(str);
            if (z) {
                int i3 = nahVar.c;
                String i4 = i3 > 0 ? uqm0.i(i3, R.plurals.group_friends_members_count, R.string.community_friends_formatted, true) : null;
                if (i4 != null) {
                    String d = uqm0.d(i3);
                    spannableString = new SpannableString(i4);
                    int K = drm0.K(0, 6, i4, d, false);
                    spannableString.setSpan(new StyleSpan(1), K, d.length() + K, 33);
                    spannableString.setSpan(new kah(this), 0, i4.length(), 33);
                    tlo0.a aVar = tlo0.Companion;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    boolean z2 = spannableString == null;
                    i = nahVar.d;
                    if (i >= 1) {
                        charSequence = this.itemView.getContext().getString(R.string.community_members_empty);
                    } else {
                        Pair pair = new Pair(Integer.valueOf(R.plurals.community_subscribers), Integer.valueOf(R.string.community_subscribers_formatted));
                        String d2 = uqm0.d(i);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(uqm0.i(i, ((Number) pair.i()).intValue(), ((Number) pair.j()).intValue(), true));
                        if (z2) {
                            sb2.append((CharSequence) rik0.a);
                        }
                        String sb3 = sb2.toString();
                        SpannableString spannableString2 = new SpannableString(sb3);
                        int K2 = drm0.K(0, 6, sb3, d2, false);
                        spannableString2.setSpan(new StyleSpan(1), K2, d2.length() + K2, 33);
                        spannableString2.setSpan(new lah(this), 0, sb3.length(), 33);
                        charSequence = spannableString2;
                    }
                    spannableStringBuilder.append(charSequence);
                    if (spannableString != null) {
                        spannableStringBuilder.append((CharSequence) spannableString);
                    }
                    s3q0 s3q0Var = s3q0.a;
                    aVar.getClass();
                    vkMiniInfoCell.setMiddle(new VkMiniInfoCell.e(new tlo0.h(spannableStringBuilder), false, false, false, true, null, 46));
                    List<UserProfile> list3 = nahVar.f;
                    if (z || (list = list3) == null || list.isEmpty()) {
                        collection = EmptyList.b;
                    } else {
                        collection = new ArrayList();
                        int size2 = list3.size();
                        int i5 = size2 <= 3 ? size2 : 3;
                        for (int i6 = 0; i6 < i5; i6++) {
                            Image image = list3.get(i6).O;
                            if (image != null && (Cb = image.Cb(50, true, false)) != null && (str2 = Cb.d.d) != null) {
                                collection.add(str2);
                            }
                        }
                    }
                    isEmpty = collection.isEmpty();
                    iterable = collection;
                    if (isEmpty) {
                        iterable = null;
                    }
                    if (iterable == null) {
                        Iterable iterable2 = iterable;
                        ArrayList arrayList = new ArrayList(c5g.u(iterable2, 10));
                        Iterator it = iterable2.iterator();
                        while (it.hasNext()) {
                            itj0.d((String) it.next(), arrayList);
                        }
                        fVar = new VkMiniInfoCell.f(arrayList, new xk(9, this, mahVar2), 2);
                    } else {
                        fVar = null;
                    }
                    vkMiniInfoCell.setUserStack(fVar);
                }
            }
            spannableString = null;
            tlo0.a aVar2 = tlo0.Companion;
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            if (spannableString == null) {
            }
            i = nahVar.d;
            if (i >= 1) {
            }
            spannableStringBuilder2.append(charSequence);
            if (spannableString != null) {
            }
            s3q0 s3q0Var2 = s3q0.a;
            aVar2.getClass();
            vkMiniInfoCell.setMiddle(new VkMiniInfoCell.e(new tlo0.h(spannableStringBuilder2), false, false, false, true, null, 46));
            List<UserProfile> list32 = nahVar.f;
            if (z) {
            }
            collection = EmptyList.b;
            isEmpty = collection.isEmpty();
            iterable = collection;
            if (isEmpty) {
            }
            if (iterable == null) {
            }
            vkMiniInfoCell.setUserStack(fVar);
        }

        public final void q6(mah mahVar, boolean z) {
            nah nahVar = mahVar.g;
            if (nahVar.e || nahVar.c != 0) {
                mahVar.h.invoke(Boolean.valueOf(z));
            } else {
                int i = h7u0.p;
                h7u0.a a = h7u0.b.a(this.itemView.getContext());
                a.g0(R.string.community_members_is_hiden);
                a.U(R.string.community_hiden_members_dialog_message);
                a.c0(R.string.close, new jah());
                a.m();
            }
            g2h g2hVar = new g2h(nahVar.b);
            g2hVar.b = "subscribers";
            g2hVar.d = "friends";
            g2hVar.a();
        }
    }

    public mah(nah nahVar, on onVar) {
        this.g = nahVar;
        this.h = onVar;
    }

    @Override // xsna.we6
    public final vif0<? extends we6> a(ViewGroup viewGroup) {
        int i = a.o;
        Context context = viewGroup.getContext();
        VkMiniInfoCell vkMiniInfoCell = new VkMiniInfoCell(context, null, 6);
        vkMiniInfoCell.setId(R.id.vk_community_members_info_item);
        vkMiniInfoCell.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        vkMiniInfoCell.setBackgroundColor(krv0.m(R.attr.vk_ui_background_content, context));
        return new a(vkMiniInfoCell);
    }

    @Override // xsna.we6
    public final int h() {
        return this.i;
    }
}
