package xsna;

import com.vk.dzenarticle.impl.ui.DzenArticleFragment;
import com.vk.ecomm.onlinebooking.impl.common.presentation.model.BookingButton;
import java.util.ListIterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.builders.ListBuilder;
import xsna.cro;
import xsna.q630;
import xsna.zai0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class gt7 implements yzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ gt7(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        String str;
        int i = this.b;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                kt7 kt7Var = (kt7) obj4;
                gur gurVar = (gur) obj;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= aVar.J(gurVar) ? 4 : 2;
                }
                if (aVar.t(intValue & 1, (intValue & 19) != 18)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1691796907, intValue, -1, "com.vk.ecomm.onlinebooking.impl.common.ui.BookingRecordCellImpl.Content.<anonymous>.<anonymous>.<anonymous> (BookingRecordCell.kt:113)");
                    }
                    ListIterator listIterator = kt7Var.d().f.listIterator(0);
                    while (true) {
                        ListBuilder.a aVar2 = (ListBuilder.a) listIterator;
                        if (aVar2.hasNext()) {
                            BookingButton bookingButton = (BookingButton) aVar2.next();
                            q630 b = gurVar.b(1.0f, q630.a.a, true);
                            int i2 = com.vk.ecomm.onlinebooking.impl.common.presentation.model.a.$EnumSwitchMapping$0[bookingButton.a.ordinal()];
                            if (i2 == 1) {
                                str = "record_reschedule_button";
                            } else if (i2 == 2) {
                                str = "record_cancel_button";
                            } else {
                                if (i2 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                str = "record_other_button";
                            }
                            mt7.a(bookingButton, ahn.E(b, str), (izs) ((zak0) kt7Var.c).getValue(), aVar, 0);
                        } else if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 1:
                iea0 iea0Var = (iea0) obj4;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if (aVar3.t(intValue2 & 1, (intValue2 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-96904649, intValue2, -1, "com.vk.profile.core.tabs.ui.photos.CommunityProfileContentPhotoViewHolder.setupShimmers.<anonymous>.<anonymous>.<anonymous> (CommunityProfileContentPhotoViewHolder.kt:218)");
                    }
                    kkh.b(iea0Var.l, null, 0, 0, 0, 0L, aVar3, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                return s3q0.a;
            case 2:
                qcy<Object>[] qcyVarArr = DzenArticleFragment.R;
                ((DzenArticleFragment) obj4).fo().b(new cro.i((zu50) obj2, (cw50) obj, (fe0) obj3));
                return s3q0.a;
            case 3:
                axq axqVar = (axq) obj4;
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                if (aVar4.t(intValue3 & 1, (intValue3 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(995386105, intValue3, -1, "com.vk.design.demo.presentation.screens.feed.FeedAvatarAnimatedStackScreenContent.AvatarAnimatedStackList.<anonymous>.<anonymous>.<anonymous> (FeedAvatarAnimatedStackScreenContent.kt:100)");
                    }
                    axqVar.j("Аватар с картинкой, аватар с плейсхолдером, текст и анимация", aVar4, 6);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar4.h();
                }
                return s3q0.a;
            default:
                ((Integer) obj2).intValue();
                ((Integer) obj3).intValue();
                zai0.a aVar5 = ((zai0) obj4).b;
                if (aVar5 instanceof zai0.a.b) {
                    return ((zai0.a.b) aVar5).a;
                }
                return null;
        }
    }
}
