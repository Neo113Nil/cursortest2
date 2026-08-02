package xsna;

import com.vk.api.generated.account.dto.AccountSetPrivacyKeyDto;
import com.vk.dto.common.data.PrivacySetting;
import com.vk.dto.photo.PhotoAlbum;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: SystemAlbumPrivacyRepositoryImpl.kt */
/* loaded from: classes3.dex */
public final class npn0 implements mpn0 {
    public final es a;

    public npn0(es esVar) {
        this.a = esVar;
    }

    @Override // xsna.mpn0
    public final io.reactivex.rxjava3.core.a a(PhotoAlbum photoAlbum, PrivacySetting privacySetting) {
        AccountSetPrivacyKeyDto accountSetPrivacyKeyDto;
        int i = photoAlbum.b;
        if (i == -9000) {
            accountSetPrivacyKeyDto = AccountSetPrivacyKeyDto.PHOTOS_WITH;
        } else {
            if (i != -15) {
                return io.reactivex.rxjava3.internal.operators.completable.i.b;
            }
            accountSetPrivacyKeyDto = AccountSetPrivacyKeyDto.PHOTOS_SAVED;
        }
        List<PrivacySetting.PrivacyRule> list = privacySetting.e;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            g5g.y(((PrivacySetting.PrivacyRule) it.next()).zb(), arrayList);
        }
        return new io.reactivex.rxjava3.internal.operators.observable.b1(rsg0.T(yfb.x(bs.n(this.a, accountSetPrivacyKeyDto, arrayList, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE))));
    }
}
