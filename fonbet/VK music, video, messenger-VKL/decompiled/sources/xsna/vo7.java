package xsna;

import androidx.compose.runtime.a;
import com.vk.core.compose.component.group.header.b;
import com.vk.core.compose.component.group.header.f;
import com.vk.ecomm.onlinebooking.impl.edit.BookingEditScreenState;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import ru.ok.android.api.methods.authV2.login.LoginApiConstants;
import xsna.q630;

/* compiled from: BookingEditInfoCell.kt */
/* loaded from: classes18.dex */
public final class vo7 {
    public final mtk0 a;
    public final wh50 b;
    public final wh50 c;
    public final f1m d;
    public final f1m e;
    public final f1m f;
    public final f1m g;
    public final f1m h;
    public final f1m i;
    public final f1m j;
    public final f1m k;
    public final f1m l;
    public final f1m m;
    public final q630 n;
    public final q630 o;
    public final q630 p;
    public final q630 q;
    public final q630 r;

    /* compiled from: BookingEditInfoCell.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;

        static {
            int[] iArr = new int[BookingEditScreenState.InfoBlock.NameError.values().length];
            try {
                iArr[BookingEditScreenState.InfoBlock.NameError.None.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BookingEditScreenState.InfoBlock.NameError.TooLong.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BookingEditScreenState.InfoBlock.NameError.Empty.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[BookingEditScreenState.InfoBlock.PhoneError.values().length];
            try {
                iArr2[BookingEditScreenState.InfoBlock.PhoneError.None.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[BookingEditScreenState.InfoBlock.PhoneError.TooLong.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[BookingEditScreenState.InfoBlock.PhoneError.WrongFormat.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[BookingEditScreenState.InfoBlock.PhoneError.Empty.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[BookingEditScreenState.InfoBlock.Error.values().length];
            try {
                iArr3[BookingEditScreenState.InfoBlock.Error.None.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[BookingEditScreenState.InfoBlock.Error.TooLong.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[BookingEditScreenState.InfoBlock.State.values().length];
            try {
                iArr4[BookingEditScreenState.InfoBlock.State.Editable.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr4[BookingEditScreenState.InfoBlock.State.ReadOnly.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$3 = iArr4;
        }
    }

    public vo7(mtk0<BookingEditScreenState.InfoBlock> mtk0Var, mtk0<Boolean> mtk0Var2, yzo yzoVar, izs<? super com.vk.ecomm.onlinebooking.impl.edit.a, s3q0> izsVar) {
        this.a = mtk0Var2;
        this.b = androidx.compose.runtime.k.b(izsVar);
        this.c = androidx.compose.runtime.k.b(yzoVar);
        this.d = bbk0.b(new ld(mtk0Var, 9));
        this.e = bbk0.b(new uo7(mtk0Var, 0));
        this.f = bbk0.b(new com.vk.movika.sdk.base.ui.m(1, mtk0Var, yzoVar));
        this.g = bbk0.b(new s1(mtk0Var, 11));
        this.h = bbk0.b(new uh3(4, mtk0Var, yzoVar));
        this.i = bbk0.b(new ng1(mtk0Var, 9));
        this.j = bbk0.b(new com.vk.movika.sdk.base.flow.binding.g(4, mtk0Var, yzoVar));
        this.k = bbk0.b(new j1(mtk0Var, 13));
        this.l = bbk0.b(new hd(mtk0Var, 9));
        this.m = bbk0.b(new so7(mtk0Var, 0));
        q630.a aVar = q630.a.a;
        this.n = txj0.h(aVar, 5);
        this.o = txj0.h(aVar, 8);
        this.p = txj0.h(aVar, 16);
        this.q = ahn.E(aVar, LoginApiConstants.PARAM_NAME_USERNAME);
        this.r = ahn.E(aVar, "user_phone");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        q630 q630Var2;
        androidx.compose.runtime.a aVar2;
        int i2;
        q630 q630Var3;
        izs izsVar;
        rgy rgyVar;
        lg90 lg90Var;
        com.vk.core.compose.component.semantics.a aVar3;
        androidx.compose.runtime.a M = aVar.M(-627994375);
        int i3 = (M.J(this) ? 32 : 16) | i;
        if (M.t(i3 & 1, (i3 & 17) != 16)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-627994375, i3, -1, "com.vk.ecomm.onlinebooking.impl.edit.ui.BookingEditInfoCellImpl.Content (BookingEditInfoCell.kt:125)");
            }
            f1m f1mVar = this.m;
            boolean booleanValue = ((Boolean) f1mVar.getValue()).booleanValue();
            f1m f1mVar2 = this.k;
            boolean z = (booleanValue && ((Boolean) f1mVar2.getValue()).booleanValue() && !((Boolean) this.l.getValue()).booleanValue()) || !((Boolean) f1mVar2.getValue()).booleanValue();
            f9t.e(this.n, M, 0);
            com.vk.core.compose.component.group.header.g.b(f.a.a(d370.N(R.string.booking_edit_info_title, 0, M), null, null, null, null, null, null, null, false, M, 805306368, 510), null, b.d.a, null, null, null, false, M, 384, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE);
            f9t.e(this.o, M, 0);
            M.K(2087823706);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-438459630, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-UserOutline24> (VkSdkIcons.kt:3584)");
            }
            lg90 b = or.b(M, -1155115631, R.drawable.vk_icon_user_outline_24, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            rgy rgyVar2 = new rgy(0, 6, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE);
            int i4 = i3 & 112;
            boolean z2 = i4 == 32;
            Object x = M.x();
            Object obj = a.C0011a.a;
            Object obj2 = x;
            if (z2 || x == obj) {
                Object qm1Var = new qm1(this, 8);
                M.R(qm1Var);
                obj2 = qm1Var;
            }
            kp7 e = sa30.e(this.e, this.f, rgyVar2, b, (izs) obj2, M, 4480);
            f1m f1mVar3 = this.d;
            BookingEditScreenState.InfoBlock.State state = (BookingEditScreenState.InfoBlock.State) f1mVar3.getValue();
            int[] iArr = a.$EnumSwitchMapping$3;
            int i5 = iArr[state.ordinal()];
            q630 q630Var4 = this.p;
            if (i5 == 1) {
                M.K(1803729604);
                i2 = 1;
                q630Var3 = q630Var4;
                e.b(0, M, d370.N(R.string.booking_edit_info_hint_name, 0, M), this.q, z);
                f9t.e(q630Var3, M, 0);
                M.j();
            } else {
                if (i5 != 2) {
                    throw alb0.c(196730123, M);
                }
                M.K(1804111028);
                e.a(this.q, M, 0);
                M.j();
                q630Var3 = q630Var4;
                i2 = 1;
            }
            M.j();
            M.K(2087856797);
            qzu0.a.getClass();
            lg90 Y0 = qzu0.Y0(M);
            rgy rgyVar3 = new rgy(4, 6, Sdk.SDKError.Reason.INVALID_INDEX_URL_VALUE);
            int i6 = i4 == 32 ? i2 : 0;
            Object x2 = M.x();
            Object obj3 = x2;
            if (i6 != 0 || x2 == obj) {
                Object p40Var = new p40(this, 15);
                M.R(p40Var);
                obj3 = p40Var;
            }
            kp7 e2 = sa30.e(this.g, this.h, rgyVar3, Y0, (izs) obj3, M, 4096);
            androidx.compose.runtime.a aVar4 = M;
            int i7 = iArr[((BookingEditScreenState.InfoBlock.State) f1mVar3.getValue()).ordinal()];
            if (i7 == i2) {
                aVar4.K(1215192555);
                e2.b(0, aVar4, d370.N(R.string.booking_edit_info_hint_phone, 0, aVar4), this.r, z);
                f9t.e(q630Var3, aVar4, 0);
                aVar4.j();
            } else {
                if (i7 != 2) {
                    throw alb0.c(-792086267, aVar4);
                }
                aVar4.K(1215575932);
                e2.a(this.r, aVar4, 0);
                aVar4.j();
            }
            aVar4.j();
            aVar4.K(2087890557);
            lg90 z3 = qzu0.z(aVar4);
            rgy rgyVar4 = new rgy(0, 0, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE);
            com.vk.core.compose.component.semantics.a b2 = cq.b("user_comment", null, 3);
            int i8 = i4 == 32 ? i2 : 0;
            Object x3 = aVar4.x();
            Object obj4 = x3;
            if (i8 != 0 || x3 == obj) {
                Object r9Var = new r9(this, 8);
                aVar4.R(r9Var);
                obj4 = r9Var;
            }
            izs izsVar2 = (izs) obj4;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1744600377, 4480, -1, "com.vk.ecomm.onlinebooking.impl.edit.ui.bookingEditMultiLineInput (BookingEditMultiLineInput.kt:46)");
            }
            f1m f1mVar4 = this.i;
            boolean J = aVar4.J(f1mVar4);
            f1m f1mVar5 = this.j;
            boolean J2 = J | aVar4.J(f1mVar5);
            Object x4 = aVar4.x();
            if (J2 || x4 == obj) {
                x4 = new gp7(f1mVar4, izsVar2, f1mVar5, rgyVar4, z3, b2);
                izsVar = izsVar2;
                rgyVar = rgyVar4;
                lg90Var = z3;
                aVar3 = b2;
                aVar4.R(x4);
            } else {
                rgyVar = rgyVar4;
                izsVar = izsVar2;
                lg90Var = z3;
                aVar3 = b2;
            }
            gp7 gp7Var = (gp7) x4;
            ((zak0) gp7Var.c).setValue(izsVar);
            ((zak0) gp7Var.d).setValue(rgyVar);
            ((zak0) gp7Var.e).setValue(lg90Var);
            ((zak0) gp7Var.f).setValue(aVar3);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            gp7Var.a(0, aVar4, d370.N(R.string.booking_edit_info_comment_hint, 0, aVar4), null, (((Boolean) this.a.getValue()).booleanValue() ? 1 : 0) ^ i2);
            aVar4.j();
            if (((Boolean) f1mVar.getValue()).booleanValue()) {
                aVar4.K(300329895);
                b(((BookingEditScreenState.InfoBlock.State) f1mVar3.getValue()) == BookingEditScreenState.InfoBlock.State.Editable ? i2 : 0, aVar4, i4);
            } else {
                aVar4.K(291470281);
            }
            aVar4.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = q630.a.a;
            aVar2 = aVar4;
        } else {
            M.h();
            q630Var2 = q630Var;
            aVar2 = M;
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new f6(this, q630Var2, i, 1);
        }
    }

    public final void b(boolean z, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(781919654);
        int i2 = (M.l(z) ? 4 : 2) | i | (M.J(this) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(781919654, i2, -1, "com.vk.ecomm.onlinebooking.impl.edit.ui.BookingEditInfoCellImpl.FillDataFromProfileCheckbox (BookingEditInfoCell.kt:217)");
            }
            vvr vvrVar = (vvr) M.r(uvi.i);
            if (z && ((Boolean) this.k.getValue()).booleanValue()) {
                M.K(-1733995255);
                q630.a aVar2 = q630.a.a;
                f9t.e(txj0.h(aVar2, 5), M, 6);
                q630 E = ahn.E(aVar2, "fill_from_profile");
                String str = ((yzo) ((zak0) this.c).getValue()).e;
                boolean booleanValue = ((Boolean) this.l.getValue()).booleanValue();
                boolean y = M.y(vvrVar) | ((i2 & 112) == 32);
                Object x = M.x();
                if (y || x == a.C0011a.a) {
                    x = new v53(1, vvrVar, this);
                    M.R(x);
                }
                zov0.b(booleanValue, str, (izs) x, E, null, false, false, M, 3072, 112);
            } else {
                M.K(-1743166884);
            }
            M.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new to7(this, z, i);
        }
    }
}
