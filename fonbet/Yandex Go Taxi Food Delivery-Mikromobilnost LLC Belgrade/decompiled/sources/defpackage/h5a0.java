package defpackage;

import android.content.Context;
import com.ybsdk.core.common.domain.entities.MoneyEntity;
import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import com.ybsdk.core.utils.text.Text;

/* loaded from: classes3.dex */
public interface h5a0 {
    rbv a(Context context);

    String b();

    ThemedImageUrlEntity c();

    ThemedImageUrlEntity d();

    String getAction();

    MoneyEntity getAmount();

    String getDescription();

    String getId();

    Text getTitle();
}
