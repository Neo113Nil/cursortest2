package com.vkontakte.android.attachments;

import androidx.annotation.NonNull;
import com.huawei.hms.framework.common.BundleUtil;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.Good;
import com.vk.dto.common.Image;
import com.vk.stat.scheme.CommonMarketStat$TypeRefSource;
import com.vkontakte.android.R;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.onelog.NetworkClass;
import xsna.dd80;
import xsna.ixj0;
import xsna.tec0;
import xsna.tfw;
import xsna.xus;

/* loaded from: classes7.dex */
public class MarketAttachment extends Attachment implements tfw, tec0 {

    @NonNull
    public final Good f;
    public static CommonMarketStat$TypeRefSource g = CommonMarketStat$TypeRefSource.LINK;
    public static final Serializer.c<MarketAttachment> CREATOR = new a();

    public class a extends Serializer.c<MarketAttachment> {
        @Override // com.vk.core.serialize.Serializer.c
        public final MarketAttachment a(Serializer serializer) {
            Good good = (Good) serializer.G(Good.class.getClassLoader());
            if (good == null) {
                return null;
            }
            return new MarketAttachment(good);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MarketAttachment[i];
        }
    }

    public MarketAttachment(@NonNull Good good) {
        this.f = good;
    }

    @Override // com.vk.dto.common.Attachment
    public final int Ab() {
        return 13;
    }

    @Override // com.vk.dto.common.Attachment
    public final int Bb() {
        return dd80.n;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(@NonNull Serializer serializer) {
        serializer.i0(this.f);
    }

    @Override // xsna.tec0
    @NonNull
    public final JSONObject Q3() {
        JSONObject e = xus.e(this);
        try {
            e.put(NetworkClass.GOOD, this.f.e5());
        } catch (JSONException unused) {
        }
        return e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f, ((MarketAttachment) obj).f);
    }

    @Override // xsna.tfw
    public final String h9() {
        Image image = this.f.n;
        if (image == null) {
            return null;
        }
        return ixj0.n(image.b);
    }

    public final int hashCode() {
        return Objects.hash(this.f);
    }

    @NonNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("market");
        Good good = this.f;
        sb.append(good.c);
        sb.append(BundleUtil.UNDERLINE_TAG);
        sb.append(good.b);
        return sb.toString();
    }

    @Override // com.vk.dto.common.Attachment
    public final int zb() {
        return R.string.attach_good;
    }
}
