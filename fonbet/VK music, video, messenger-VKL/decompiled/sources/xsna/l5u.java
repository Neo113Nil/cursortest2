package xsna;

import android.content.Context;
import android.text.TextUtils;
import android.util.Size;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.view.components.button.VkSimpleButton;
import com.vk.core.view.components.cell.VkCell;
import com.vk.core.view.components.picture.VkImage;
import com.vk.core.view.components.text.VkText;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.ecomm.market.api.labels.MarketItemModalApproveInfoModel;
import com.vk.ecomm.market.api.labels.MarketModalContentItem;
import com.vk.imageloader.ImageScreenSize;
import com.vk.imageloader.view.VKImageView;
import com.vk.toggle.features.SoccomFeatures;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.dw20;
import xsna.tlo0;

/* compiled from: GoodPartnerIntegrationTermsModalDialogBuilder.kt */
/* loaded from: classes18.dex */
public final class l5u extends dw20.b {
    public final gzs<s3q0> e;

    /* compiled from: GoodPartnerIntegrationTermsModalDialogBuilder.kt */
    public static final class a extends RecyclerView.e0 {

        /* compiled from: GoodPartnerIntegrationTermsModalDialogBuilder.kt */
        /* renamed from: xsna.l5u$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C3234a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[MarketModalContentItem.values().length];
                try {
                    iArr[MarketModalContentItem.FULL_SIZE_APPLICATION.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[MarketModalContentItem.FULL_SIZE_PAYMENT.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[MarketModalContentItem.FULL_SIZE_DELIVERY.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }
    }

    /* compiled from: GoodPartnerIntegrationTermsModalDialogBuilder.kt */
    public static final class b extends RecyclerView.Adapter<a> {
        public final List<c210> c;

        public b(List<c210> list) {
            this.c = list;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            return this.c.size();
        }

        /* JADX WARN: Code restructure failed: missing block: B:7:0x0065, code lost:
        
            if (r4 == null) goto L9;
         */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void onBindViewHolder(a aVar, int i) {
            int i2;
            VkCell.Left.b a;
            String str;
            a aVar2 = aVar;
            c210 c210Var = this.c.get(i);
            VkCell vkCell = (VkCell) aVar2.itemView;
            vkCell.setMiddle(VkCell.Middle.a.a(VkCell.Middle.Companion, new VkCell.Middle.e(oq.d(tlo0.Companion, c210Var.b), 0, (TextUtils.TruncateAt) null, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 62), new VkCell.Middle.d(new tlo0.h(c210Var.c), (gzs) null, 0, (TextUtils.TruncateAt) null, (VkCell.Middle.d.b.C0815b) null, (VkCell.Middle.d.b.C0815b) null, 62), null, 12));
            vkCell.setLeftMainViewController(new e());
            Context context = aVar2.itemView.getContext();
            dly dlyVar = c210Var.d;
            if (dlyVar != null) {
                TypedValue typedValue = krv0.a;
                boolean f = epx.f(krv0.i(context), Boolean.FALSE);
                String str2 = dlyVar.a;
                if (str2 != null) {
                    str = f ? str2 : null;
                }
                str = dlyVar.b;
                float f2 = 28;
                a = VkCell.Left.a.a(VkCell.Left.Companion, new VkCell.Left.Main.e(new c(str), new Size(iah0.a(f2), iah0.a(f2))));
            } else {
                VkCell.Left.a aVar3 = VkCell.Left.Companion;
                int i3 = a.C3234a.$EnumSwitchMapping$0[c210Var.a.ordinal()];
                if (i3 == 1) {
                    i2 = R.drawable.vk_icon_market_like_outline_28;
                } else if (i3 == 2) {
                    i2 = R.drawable.vk_icon_payment_card_outline_28;
                } else {
                    if (i3 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i2 = R.drawable.vk_icon_truck_outline_28;
                }
                a = VkCell.Left.a.a(aVar3, new VkCell.Left.Main.c(new gko(i2), VkCell.Left.Main.Size.Small, (k1u0) null, 12));
            }
            vkCell.setLeft(a);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final a onCreateViewHolder(ViewGroup viewGroup, int i) {
            a aVar = new a(new VkCell(viewGroup.getContext(), null, 6, 0));
            SoccomFeatures.MULTI_INTEGRATION.h();
            return aVar;
        }
    }

    /* compiled from: GoodPartnerIntegrationTermsModalDialogBuilder.kt */
    public static final class c implements VkCell.f {
        public final String a;

        public c(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.a, ((c) obj).a);
        }

        public final int hashCode() {
            String str = this.a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("LabelIconViewParams(url="), this.a, ')');
        }
    }

    /* compiled from: GoodPartnerIntegrationTermsModalDialogBuilder.kt */
    public static final class d implements VkCell.d {
        public final VKImageView a;

        public d(Context context) {
            VKImageView vKImageView = new VKImageView(context, null, 6, 0);
            vKImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            this.a = vKImageView;
        }

        @Override // com.vk.core.view.components.cell.VkCell.d
        public final void a(VkCell.f fVar) {
            if ((fVar instanceof c ? (c) fVar : null) != null) {
                this.a.O0(((c) fVar).a, ImageScreenSize.SIZE_28DP);
            }
        }

        @Override // com.vk.core.view.components.cell.VkCell.d
        public final View getView() {
            return this.a;
        }
    }

    /* compiled from: GoodPartnerIntegrationTermsModalDialogBuilder.kt */
    public static final class e implements VkCell.e {
        @Override // com.vk.core.view.components.cell.VkCell.e
        public final VkCell.d create(Context context) {
            return new d(context);
        }
    }

    public l5u(Context context, MarketItemModalApproveInfoModel marketItemModalApproveInfoModel, gzs<s3q0> gzsVar, boolean z) {
        super(context, null);
        ArrayList arrayList;
        ImageSize imageSize;
        this.e = gzsVar;
        View inflate = e3m.b(context).inflate(R.layout.market_item_delivery_terms_bottom_sheet_layout, (ViewGroup) null);
        VkImage vkImage = (VkImage) inflate.findViewById(R.id.dialog_image);
        VkText vkText = (VkText) inflate.findViewById(R.id.dialog_title_view);
        VkText vkText2 = (VkText) inflate.findViewById(R.id.dialog_subtitle_view);
        VkSimpleButton vkSimpleButton = (VkSimpleButton) inflate.findViewById(R.id.accept_button_view);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.contentItems);
        List<c210> list = marketItemModalApproveInfoModel.f;
        if (list.isEmpty()) {
            bwt0.p0(recyclerView, false);
        } else {
            recyclerView.setAdapter(new b(list));
        }
        Image image = marketItemModalApproveInfoModel.a;
        if (image != null && (arrayList = image.b) != null && (imageSize = (ImageSize) j5g.Y(arrayList)) != null) {
            com.vk.dto.common.im.Image image2 = imageSize.d;
            f4m.o(iah0.a(image2.b), iah0.a(image2.c), vkImage);
        } else if (marketItemModalApproveInfoModel.e == MarketItemModalApproveInfoModel.ModalApproveInfoType.INTEGRATION_PRICE) {
            float f = 56;
            f4m.o(iah0.a(f), iah0.a(f), vkImage);
        } else {
            float f2 = 130;
            f4m.o(iah0.a(f2), iah0.a(f2), vkImage);
        }
        bwt0.S(vkImage, new he3(25, vkImage, marketItemModalApproveInfoModel));
        vkText.setText(marketItemModalApproveInfoModel.b);
        vkText2.setText(marketItemModalApproveInfoModel.c);
        vkSimpleButton.setText(marketItemModalApproveInfoModel.d);
        jjc.g(vkSimpleButton, new j9k(this, 16));
        D0(inflate, false);
        if (!z) {
            F0(true);
            x(0);
            u(0);
        }
        I(true);
        G0();
        O();
        if (z) {
            p0(24);
            n0(16);
            o0(16);
        }
        y(enj.c(R.drawable.vk_bg_radius_12, e3m.f(R.attr.vk_ui_background_modal, context), context));
        this.d.x0 = iah0.a(8);
    }

    @Override // xsna.dw20.b, xsna.dw20.a
    public final dw20 f() {
        return new dw20();
    }
}
