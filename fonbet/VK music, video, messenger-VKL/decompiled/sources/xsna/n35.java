package xsna;

import com.vk.api.generated.account.dto.AccountGetUserObjectDto;
import com.vk.api.generated.auth.dto.AuthGetExchangeTokenResponseDto;
import com.vk.api.generated.auth.dto.AuthUserExchangeTokenDto;
import com.vk.api.sdk.auth.AccountProfileType;
import com.vk.dto.common.id.UserId;
import com.vk.im.engine.models.dialogs.BusinessNotifyInfo;
import com.vk.superapp.api.internal.oauthrequests.EmptyDataException;
import io.requery.android.database.sqlite.SQLiteStatement;
import java.util.Iterator;
import java.util.List;
import xsna.xbu0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class n35 implements yzs {
    public final /* synthetic */ int b;

    public /* synthetic */ n35(int i) {
        this.b = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00da A[RETURN] */
    @Override // xsna.yzs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        String str;
        Object obj4;
        switch (this.b) {
            case 0:
                AccountGetUserObjectDto accountGetUserObjectDto = (AccountGetUserObjectDto) j5g.a0((List) obj2);
                List<AuthUserExchangeTokenDto> d = ((AuthGetExchangeTokenResponseDto) obj).d();
                xbu0 xbu0Var = null;
                if (d != null) {
                    Iterator<T> it = d.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj4 = it.next();
                            AuthUserExchangeTokenDto authUserExchangeTokenDto = (AuthUserExchangeTokenDto) obj4;
                            if (accountGetUserObjectDto != null) {
                                long j = authUserExchangeTokenDto.getUserId().b;
                                Long i = accountGetUserObjectDto.i();
                                if (i != null && j == i.longValue()) {
                                }
                            }
                        } else {
                            obj4 = null;
                        }
                    }
                    AuthUserExchangeTokenDto authUserExchangeTokenDto2 = (AuthUserExchangeTokenDto) obj4;
                    if (authUserExchangeTokenDto2 != null) {
                        str = authUserExchangeTokenDto2.d();
                        if (accountGetUserObjectDto != null && str != null) {
                            String f = accountGetUserObjectDto.f();
                            String str2 = f != null ? "" : f;
                            String j2 = accountGetUserObjectDto.j();
                            String str3 = j2 != null ? j2 : "";
                            String k = accountGetUserObjectDto.k();
                            Long i2 = accountGetUserObjectDto.i();
                            xbu0Var = new xbu0(new UserId(i2 == null ? i2.longValue() : -1L), str2, k, str, AccountProfileType.NORMAL, null, v1v.a(' ', str2, str3), new xbu0.c(Boolean.FALSE, accountGetUserObjectDto.e()), 32);
                        }
                        if (xbu0Var == null) {
                            return xbu0Var;
                        }
                        StringBuilder sb = new StringBuilder("AuthGetExchangeLoginDataCommand: exchange token or user info is null. Exchange token is null? ");
                        sb.append(str == null);
                        sb.append("; User info is null? ");
                        sb.append(accountGetUserObjectDto == null);
                        throw new EmptyDataException(sb.toString());
                    }
                }
                str = null;
                if (accountGetUserObjectDto != null) {
                    String f2 = accountGetUserObjectDto.f();
                    if (f2 != null) {
                    }
                    String j22 = accountGetUserObjectDto.j();
                    if (j22 != null) {
                    }
                    String k2 = accountGetUserObjectDto.k();
                    Long i22 = accountGetUserObjectDto.i();
                    xbu0Var = new xbu0(new UserId(i22 == null ? i22.longValue() : -1L), str2, k2, str, AccountProfileType.NORMAL, null, v1v.a(' ', str2, str3), new xbu0.c(Boolean.FALSE, accountGetUserObjectDto.e()), 32);
                }
                if (xbu0Var == null) {
                }
                break;
            default:
                SQLiteStatement sQLiteStatement = (SQLiteStatement) obj;
                int intValue = ((Integer) obj3).intValue();
                BusinessNotifyInfo businessNotifyInfo = ((com.vk.im.engine.models.dialogs.b) obj2).M;
                rdi.k(sQLiteStatement, intValue, businessNotifyInfo != null ? Integer.valueOf(businessNotifyInfo.c) : null);
                return s3q0.a;
        }
    }
}
