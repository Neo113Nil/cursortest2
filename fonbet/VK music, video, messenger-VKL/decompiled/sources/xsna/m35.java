package xsna;

import androidx.compose.runtime.a;
import com.vk.api.generated.auth.dto.AuthGetExchangeTokenResponseDto;
import com.vk.api.generated.auth.dto.AuthUserExchangeTokenDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.api.sdk.auth.AccountProfileType;
import com.vk.core.serialize.Serializer;
import com.vk.superapp.api.internal.oauthrequests.EmptyDataException;
import com.vkontakte.android.R;
import io.requery.android.database.sqlite.SQLiteStatement;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import xsna.psn0;
import xsna.xbu0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class m35 implements yzs {
    public final /* synthetic */ int b;

    public /* synthetic */ m35(int i) {
        this.b = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0283 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x021d  */
    /* JADX WARN: Type inference failed for: r6v5, types: [xsna.xbu0] */
    @Override // xsna.yzs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        String str;
        String r2;
        Object obj4;
        byte[] bArr = null;
        switch (this.b) {
            case 0:
                UsersUserFullDto usersUserFullDto = (UsersUserFullDto) j5g.a0((List) obj2);
                List<AuthUserExchangeTokenDto> d = ((AuthGetExchangeTokenResponseDto) obj).d();
                if (d != null) {
                    Iterator it = d.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj4 = it.next();
                            if (epx.f(((AuthUserExchangeTokenDto) obj4).getUserId(), usersUserFullDto != null ? usersUserFullDto.s1() : null)) {
                            }
                        } else {
                            obj4 = null;
                        }
                    }
                    AuthUserExchangeTokenDto authUserExchangeTokenDto = (AuthUserExchangeTokenDto) obj4;
                    if (authUserExchangeTokenDto != null) {
                        str = authUserExchangeTokenDto.d();
                        if (usersUserFullDto != null && str != null) {
                            String D0 = usersUserFullDto.D0();
                            String str2 = D0 != null ? "" : D0;
                            String x1 = usersUserFullDto.x1();
                            String str3 = x1 != null ? x1 : "";
                            r2 = usersUserFullDto.r2();
                            if (r2 != null || (r1 = r2.concat("&cs=100x0")) == null) {
                                String X1 = usersUserFullDto.X1();
                            }
                            bArr = new xbu0(usersUserFullDto.s1(), str2, X1, str, AccountProfileType.NORMAL, null, v1v.a(' ', str2, str3), new xbu0.c(usersUserFullDto.h3(), usersUserFullDto.w0()), 32);
                        }
                        if (bArr == null) {
                            return bArr;
                        }
                        StringBuilder sb = new StringBuilder("AuthGetExchangeLoginDataCommand: exchange token or user info is null. Exchange token is null? ");
                        sb.append(str == null);
                        sb.append("; User info is null? ");
                        sb.append(usersUserFullDto == null);
                        throw new EmptyDataException(sb.toString());
                    }
                }
                str = null;
                if (usersUserFullDto != null) {
                    String D02 = usersUserFullDto.D0();
                    if (D02 != null) {
                    }
                    String x12 = usersUserFullDto.x1();
                    if (x12 != null) {
                    }
                    r2 = usersUserFullDto.r2();
                    if (r2 != null) {
                    }
                    String X12 = usersUserFullDto.X1();
                    bArr = new xbu0(usersUserFullDto.s1(), str2, X12, str, AccountProfileType.NORMAL, null, v1v.a(' ', str2, str3), new xbu0.c(usersUserFullDto.h3(), usersUserFullDto.w0()), 32);
                }
                if (bArr == null) {
                }
            case 1:
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (aVar.t(intValue & 1, (intValue & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(815330854, intValue, -1, "com.vk.profile.community.details.impl.description.ComposableSingletons$CommunityAddDescriptionViewKt.lambda$815330854.<anonymous> (CommunityAddDescriptionView.kt:113)");
                    }
                    String N = d370.N(R.string.community_add_info_bs_save, 0, aVar);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var = (ylu0) aVar.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    yqv0.c(N, null, ylu0Var.getText().e, null, null, 0, 0, null, 0, false, 0, 0, null, null, aVar, 0, 0, 16378);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 2:
                col colVar = (col) obj;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= aVar2.J(colVar) ? 4 : 2;
                }
                if (aVar2.t(intValue2 & 1, (intValue2 & 19) != 18)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-379861329, intValue2, -1, "com.vk.design.demo.presentation.screens.typography.ComposableSingletons$TypographyComponentsDemoContentKt.lambda$-379861329.<anonymous> (TypographyComponentsDemoContent.kt:92)");
                    }
                    Object x = aVar2.x();
                    int i = 9;
                    a.C0011a.C0012a c0012a = a.C0011a.a;
                    if (x == c0012a) {
                        x = new re0(i);
                        aVar2.R(x);
                    }
                    int i2 = ((intValue2 << 21) & 29360128) | 54;
                    colVar.c(true, x, null, psn0.a.C3529a.a("Tab", aVar2), null, null, null, aVar2, i2, 116);
                    Object x2 = aVar2.x();
                    if (x2 == c0012a) {
                        x2 = new se0(15);
                        aVar2.R(x2);
                    }
                    colVar.c(false, (gzs) x2, null, psn0.a.C3529a.a("Tab", aVar2), null, null, null, aVar2, i2, 116);
                    Object x3 = aVar2.x();
                    if (x3 == c0012a) {
                        x3 = new te0(13);
                        aVar2.R(x3);
                    }
                    colVar.c(false, (gzs) x3, null, psn0.a.C3529a.a("Tab", aVar2), null, null, null, aVar2, i2, 116);
                    Object x4 = aVar2.x();
                    if (x4 == c0012a) {
                        x4 = new c6(9);
                        aVar2.R(x4);
                    }
                    colVar.c(false, (gzs) x4, null, psn0.a.C3529a.a("Tab", aVar2), null, null, null, aVar2, i2, 116);
                    Object x5 = aVar2.x();
                    if (x5 == c0012a) {
                        x5 = new z34(7);
                        aVar2.R(x5);
                    }
                    colVar.c(false, (gzs) x5, null, psn0.a.C3529a.a("Tab", aVar2), null, null, null, aVar2, i2, 116);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
            case 3:
                SQLiteStatement sQLiteStatement = (SQLiteStatement) obj;
                int intValue3 = ((Integer) obj3).intValue();
                List<Integer> list = ((com.vk.im.engine.models.dialogs.b) obj2).L;
                if (list.isEmpty()) {
                    list = null;
                }
                if (list != null) {
                    HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap = Serializer.a;
                    bArr = Serializer.b.g(list);
                }
                rdi.h(sQLiteStatement, intValue3, bArr);
                return s3q0.a;
            default:
                return new bnf0((fnf0) obj, (bof0) obj2, (b8h0) obj3);
        }
    }
}
