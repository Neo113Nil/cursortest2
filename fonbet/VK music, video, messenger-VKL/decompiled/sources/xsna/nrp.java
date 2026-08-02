package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.view.components.picture.VkImage;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.feed.core.models.EntryPointsItem;
import com.vk.feed.core.models.Icon;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vkontakte.android.R;
import xsna.e3m;

/* compiled from: EntryPointItemHolder.kt */
/* loaded from: classes4.dex */
public final class nrp extends vif0<EntryPointsItem> implements View.OnClickListener {
    public final VkImage n;
    public final TextView o;
    public final TextView p;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: EntryPointItemHolder.kt */
    public static final class a {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a CHAIN;
        public static final a PHONE;
        public static final a QR;
        public static final a SEARCH;
        public static final a USER_ADD;
        private final int id;
        private final String value;

        static {
            a aVar = new a("PHONE", 0, R.drawable.phone_gradient_circle_32, "phone_gradient_circle");
            PHONE = aVar;
            a aVar2 = new a("SEARCH", 1, R.drawable.search_gradient_circle_32, "search_gradient_circle");
            SEARCH = aVar2;
            a aVar3 = new a("CHAIN", 2, R.drawable.chain_gradient_circle_32, "chain_gradient_circle");
            CHAIN = aVar3;
            a aVar4 = new a("QR", 3, R.drawable.qr_code_outline_gradient_circle_32, "qr_code_outline_gradient_circle");
            QR = aVar4;
            a aVar5 = new a("USER_ADD", 4, R.drawable.user_add_gradient_circle_32, "user_add_gradient_circle");
            USER_ADD = aVar5;
            a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5};
            $VALUES = aVarArr;
            $ENTRIES = new asp(aVarArr);
        }

        public a(String str, int i, int i2, String str2) {
            this.id = i2;
            this.value = str2;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }

        public final int h() {
            return this.id;
        }

        public final String i() {
            return this.value;
        }
    }

    public nrp(ViewGroup viewGroup) {
        super(viewGroup, R.layout.entry_point_item_holder, 0);
        this.n = (VkImage) this.itemView.findViewById(R.id.icon);
        this.o = (TextView) this.itemView.findViewById(R.id.title);
        this.p = (TextView) this.itemView.findViewById(R.id.subtitle);
        this.itemView.setOnClickListener(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x006c  */
    @Override // xsna.vif0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i6(EntryPointsItem entryPointsItem) {
        ImageSize Cb;
        a aVar;
        Drawable a2;
        EntryPointsItem entryPointsItem2 = entryPointsItem;
        Icon icon = entryPointsItem2.b;
        String str = icon.b;
        VkImage vkImage = this.n;
        if (str != null && !drm0.N(str)) {
            if (str != null) {
                a[] values = a.values();
                int length = values.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        aVar = null;
                        break;
                    }
                    aVar = values[i];
                    if (str.equals(aVar.i())) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (aVar != null) {
                    a2 = m33.a(aVar.h(), this.itemView.getContext());
                    if (a2 instanceof LayerDrawable) {
                        Drawable findDrawableByLayerId = ((LayerDrawable) a2).findDrawableByLayerId(R.id.entry_point_base_icon);
                        Drawable mutate = findDrawableByLayerId != null ? findDrawableByLayerId.mutate() : null;
                        if (mutate != null) {
                            Context context = this.itemView.getContext();
                            e3m.a aVar2 = e3m.a;
                            mutate.setTint(context.getColor(R.color.vk_white));
                        }
                    }
                    if (a2 != null) {
                        vkImage.setImageDrawable(a2);
                        this.o.setText(entryPointsItem2.c);
                        this.p.setText(entryPointsItem2.d);
                    }
                }
            }
            a2 = null;
            if (a2 != null) {
            }
        }
        int b = cn70.b(32);
        Image image = icon.c;
        String str2 = (image == null || (Cb = image.Cb(b, true, false)) == null) ? null : Cb.d.d;
        if (str2 == null || str2.length() == 0) {
            str2 = icon.d;
        }
        vkImage.o0(str2, null);
        this.o.setText(entryPointsItem2.c);
        this.p.setText(entryPointsItem2.d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (jjc.b()) {
            return;
        }
        if (view.equals(this.itemView)) {
            di60.w(((EntryPointsItem) this.m).f, this.itemView.getContext(), null, null, null, null, 62);
        }
        SchemeStat$TypeClick b = SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, null, null, null, ((EntryPointsItem) this.m).e, null, 46, null), new com.vk.stat.scheme.c0(), 2);
        UiTracker uiTracker = UiTracker.a;
        MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
        uzp0 uzp0Var = UiTracker.h;
        uzp0Var.getClass();
        new bjc(c, b, uzp0Var.a).q();
    }
}
