package xsna;

import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.vk.core.files.a;
import com.vk.sharing.im_engine_impl.BaseSharingExternalActivity;
import com.vkontakte.android.R;
import java.util.ArrayList;

/* compiled from: BaseSharingExternalActivity.java */
/* loaded from: classes5.dex */
public final class ym6 extends a.C0764a {
    public final /* synthetic */ ner0 a;
    public final /* synthetic */ BaseSharingExternalActivity b;

    public ym6(BaseSharingExternalActivity baseSharingExternalActivity, ner0 ner0Var) {
        this.b = baseSharingExternalActivity;
        this.a = ner0Var;
    }

    @Override // com.vk.core.files.a.C0764a
    public final void a(@NonNull ArrayList<Uri> arrayList) {
        boolean z = arrayList.size() > 1;
        Intent intent = new Intent();
        BaseSharingExternalActivity baseSharingExternalActivity = this.b;
        intent.setType(baseSharingExternalActivity.getIntent().getType());
        intent.putExtras(baseSharingExternalActivity.getIntent().getExtras());
        if (z) {
            intent.setAction("android.intent.action.SEND_MULTIPLE");
            ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
            arrayList2.addAll(arrayList);
            intent.putParcelableArrayListExtra("android.intent.extra.STREAM", arrayList2);
        } else {
            intent.setAction("android.intent.action.SEND");
            intent.putExtra("android.intent.extra.STREAM", arrayList.get(0));
        }
        u1u0.b(this.a);
        baseSharingExternalActivity.setIntent(intent);
        baseSharingExternalActivity.J3();
    }

    @Override // com.vk.core.files.a.C0764a
    public final void b(@Nullable Exception exc) {
        cvk.u(R.string.error, false);
        u1u0.b(this.a);
        this.b.finish();
    }
}
