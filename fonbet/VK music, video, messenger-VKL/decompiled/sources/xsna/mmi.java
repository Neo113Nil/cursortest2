package xsna;

import com.vkontakte.android.R;
import io.requery.android.database.sqlite.SQLiteStatement;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class mmi implements yzs {
    public final /* synthetic */ int b;

    public /* synthetic */ mmi(int i) {
        this.b = i;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.b) {
            case 0:
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (aVar.t(intValue & 1, (intValue & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1692233404, intValue, -1, "com.vk.libvideo.bottomsheet.about.delegate.ComposableSingletons$VideoDescriptionDelegateKt.lambda$1692233404.<anonymous> (VideoDescriptionDelegate.kt:492)");
                    }
                    qzu0.a.getClass();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1678653698, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-ArchiveOutline16> (VkIcons.kt:268)");
                    }
                    lg90 a = pg90.a(R.drawable.vk_icon_archive_outline_16, 0, aVar);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var = (ylu0) aVar.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    pzu0.b(a, null, q630.a.a, ylu0Var.getText().p, aVar, 440, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            case 1:
                ((SQLiteStatement) obj).bindLong(((Integer) obj3).intValue(), ((com.vk.im.engine.models.dialogs.b) obj2).b0);
                break;
            default:
                nov novVar = (nov) obj3;
                novVar.e((((Integer) obj).intValue() / 2.0f) - (novVar.getOriginalWidth() / 2.0f), ((Integer) obj2).intValue() - novVar.getOriginalHeight());
                break;
        }
        return s3q0.a;
    }
}
