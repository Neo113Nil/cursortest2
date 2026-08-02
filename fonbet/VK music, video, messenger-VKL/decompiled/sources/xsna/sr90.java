package xsna;

import com.vk.superapp.vkpay.checkout.data.model.AddCardMethod;
import com.vk.superapp.vkpay.checkout.data.model.Card;
import com.vk.superapp.vkpay.checkout.data.model.Cash;
import com.vk.superapp.vkpay.checkout.data.model.GooglePay;
import com.vk.superapp.vkpay.checkout.data.model.NoVkPay;
import com.vk.superapp.vkpay.checkout.data.model.PayMethodData;
import com.vk.superapp.vkpay.checkout.data.model.VkPay;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;

/* compiled from: PayMethodItem.kt */
/* loaded from: classes6.dex */
public abstract class sr90<T extends PayMethodData> implements hfz {
    public final T b;

    /* compiled from: PayMethodItem.kt */
    public static final class a {
        public static sr90 a(PayMethodData payMethodData) {
            if (payMethodData instanceof Cash) {
                return new yy9((Cash) payMethodData);
            }
            if (payMethodData instanceof VkPay) {
                return new jer0((VkPay) payMethodData);
            }
            if (payMethodData instanceof GooglePay) {
                return new z9u((GooglePay) payMethodData);
            }
            if (payMethodData instanceof Card) {
                return new ht9((Card) payMethodData);
            }
            if (payMethodData instanceof NoVkPay) {
                return new q470((NoVkPay) payMethodData);
            }
            if (payMethodData instanceof AddCardMethod) {
                return new vk0((AddCardMethod) payMethodData);
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    public sr90(T t) {
        this.b = t;
    }

    public abstract int a();

    public String b() {
        return null;
    }

    public abstract Pair<Integer, String[]> c();

    public boolean d() {
        return true;
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return 0;
    }
}
