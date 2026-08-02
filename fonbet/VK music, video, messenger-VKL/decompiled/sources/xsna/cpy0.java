package xsna;

import android.os.Binder;
import android.os.Bundle;
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
import ru.rustore.sdk.review.model.ReviewInfo;

/* loaded from: classes9.dex */
public abstract class cpy0 extends Binder implements IInterface {
    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        RuStoreException ruStoreUserUnauthorizedException;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface("ru.vk.store.provider.review.RequestReviewFlowCallback");
        }
        if (i == 1598968902) {
            parcel2.writeString("ru.vk.store.provider.review.RequestReviewFlowCallback");
            return true;
        }
        if (i == 1) {
            Object createFromParcel = parcel.readInt() != 0 ? Bundle.CREATOR.createFromParcel(parcel) : null;
            nsy0 nsy0Var = nsy0.this;
            nsy0Var.d.invoke(new ReviewInfo((Bundle) createFromParcel));
            inj.b(nsy0Var.b, nsy0Var);
        } else {
            if (i != 2) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            int readInt = parcel.readInt();
            String readString = parcel.readString();
            nsy0 nsy0Var2 = nsy0.this;
            ru.rustore.sdk.review.s sVar = nsy0Var2.e;
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
            sVar.invoke(ruStoreUserUnauthorizedException);
            inj.b(nsy0Var2.b, nsy0Var2);
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
