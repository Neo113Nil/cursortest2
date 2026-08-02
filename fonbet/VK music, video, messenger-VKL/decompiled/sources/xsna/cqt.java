package xsna;

import com.vk.api.generated.gifts.dto.GiftsCatalogGiftDto;
import com.vk.dto.gift.CatalogedGift;
import com.vk.dto.gift.Gift;
import com.vk.toggle.features.VasFeatures;

/* compiled from: GetBalanceAndGiftByStickerIdRequest.kt */
/* loaded from: classes15.dex */
public final class cqt extends com.vk.api.request.rx.batch.a<GiftsCatalogGiftDto, Integer, dqt> {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public cqt(int i) {
        super(yfb.y(r1, new com.vk.movika.sdk.base.utils.b(28)), yfb.y(new tfx("account.getBalance", new nq(0), new oq(0)), new bqt(0)));
        tfx tfxVar;
        VasFeatures vasFeatures = VasFeatures.VAS_GIFTS_SERVICE_CATALOG;
        vasFeatures.getClass();
        if (com.vk.toggle.b.A.a(vasFeatures)) {
            tfxVar = new tfx("gifts.getCatalogGiftAlias", new r11(16), new sf3(13));
            tfx.l(tfxVar, "gift_id", -i, 0, 0, 12);
        } else {
            tfx tfxVar2 = new tfx("gifts.getCatalogGift", new io.reactivex.rxjava3.processors.b(17), new io.reactivex.rxjava3.subjects.b(19));
            tfx.l(tfxVar2, "gift_id", -i, 0, 0, 12);
            tfxVar = tfxVar2;
        }
    }

    @Override // com.vk.api.request.rx.batch.a
    public final dqt K0(bv6<GiftsCatalogGiftDto> bv6Var, bv6<Integer> bv6Var2) {
        GiftsCatalogGiftDto giftsCatalogGiftDto = bv6Var.a;
        int intValue = bv6Var2.a.intValue();
        Gift a = vzt.a(giftsCatalogGiftDto.d());
        Integer f = giftsCatalogGiftDto.f();
        boolean z = false;
        int intValue2 = f != null ? f.intValue() : 0;
        Integer e = giftsCatalogGiftDto.e();
        int intValue3 = e != null ? e.intValue() : 0;
        Integer g = giftsCatalogGiftDto.g();
        int intValue4 = g != null ? g.intValue() : 0;
        if (intValue2 != 0 || intValue3 > 0 ? intValue2 <= 0 : intValue4 <= 0) {
            z = true;
        }
        return new dqt(intValue, new CatalogedGift(a, z));
    }
}
