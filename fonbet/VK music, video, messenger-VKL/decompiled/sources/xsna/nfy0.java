package xsna;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import ru.rustore.sdk.core.exception.RuStoreApplicationBannedException;
import ru.rustore.sdk.core.exception.RuStoreException;
import ru.rustore.sdk.core.exception.RuStoreUserBannedException;
import ru.rustore.sdk.core.exception.RuStoreUserUnauthorizedException;
import ru.rustore.sdk.review.errors.RuStoreInvalidReviewInfo;
import ru.rustore.sdk.review.errors.RuStoreRequestLimitReached;
import ru.rustore.sdk.review.errors.RuStoreReviewExists;

/* loaded from: classes9.dex */
public abstract class nfy0 extends Binder implements IInterface {
    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        RuStoreException ruStoreUserUnauthorizedException;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface("ru.vk.store.provider.review.LaunchReviewFlowCallback");
        }
        if (i == 1598968902) {
            parcel2.writeString("ru.vk.store.provider.review.LaunchReviewFlowCallback");
            return true;
        }
        if (i == 1) {
            v8y0 v8y0Var = v8y0.this;
            v8y0Var.e.invoke();
            inj.b(v8y0Var.b, v8y0Var);
        } else {
            if (i != 2) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            int readInt = parcel.readInt();
            String readString = parcel.readString();
            v8y0 v8y0Var2 = v8y0.this;
            ru.rustore.sdk.review.o oVar = v8y0Var2.f;
            if (readInt == 1001) {
                ruStoreUserUnauthorizedException = new RuStoreUserUnauthorizedException();
            } else if (readInt == 1004) {
                ruStoreUserUnauthorizedException = new RuStoreUserBannedException();
            } else if (readInt != 1005) {
                switch (readInt) {
                    case 3001:
                        ruStoreUserUnauthorizedException = new RuStoreRequestLimitReached();
                        break;
                    case 3002:
                        ruStoreUserUnauthorizedException = new RuStoreReviewExists();
                        break;
                    case BANNER_AUTO_REDIRECT_NOT_OVERRIDE_URL_VALUE:
                        ruStoreUserUnauthorizedException = new RuStoreInvalidReviewInfo();
                        break;
                    default:
                        if (readString == null) {
                            readString = "";
                        }
                        ruStoreUserUnauthorizedException = new RuStoreException(readString);
                        break;
                }
            } else {
                ruStoreUserUnauthorizedException = new RuStoreApplicationBannedException();
            }
            oVar.invoke(ruStoreUserUnauthorizedException);
            inj.b(v8y0Var2.b, v8y0Var2);
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
