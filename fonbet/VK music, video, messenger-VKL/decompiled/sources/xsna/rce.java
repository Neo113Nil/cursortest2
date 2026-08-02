package xsna;

import android.R;
import com.vk.clips.viewer.impl.grid.lists.fragments.ClipsGridDelayedPublishListFragment;
import com.vk.im.engine.models.dialogs.ChatSettings;
import io.requery.android.database.sqlite.SQLiteStatement;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class rce implements yzs {
    public final /* synthetic */ int b;

    public /* synthetic */ rce(int i) {
        this.b = i;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        lg90 d1;
        switch (this.b) {
            case 0:
                ((Integer) obj).intValue();
                int i = ClipsGridDelayedPublishListFragment.l0;
                return s3q0.a;
            case 1:
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (aVar.t(intValue & 1, (intValue & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1336546615, intValue, -1, "com.vk.profile.tool.compose.edit.ComposableSingletons$CellKt.lambda$-1336546615.<anonymous> (Cell.kt:14)");
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 2:
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if (aVar2.t(intValue2 & 1, (intValue2 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(558638247, intValue2, -1, "androidx.compose.ui.tooling.ComposableSingletons$PreviewActivity_androidKt.lambda$558638247.<anonymous> (PreviewActivity.android.kt:121)");
                    }
                    cjo0.b(null, 0L, 0L, 0L, 0L, 0, false, 0, 0, null, aVar2, 6);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
            case 3:
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                if (aVar3.t(intValue3 & 1, (intValue3 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1041574466, intValue3, -1, "com.vk.core.compose.component.datetime.ComposableSingletons$VkTemporalPickerKt.lambda$1041574466.<anonymous> (VkTemporalPicker.kt:150)");
                    }
                    cjo0.c(d370.N(R.string.ok, 6, aVar3), null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, aVar3, 0, 0, 262142);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                return s3q0.a;
            case 4:
                SQLiteStatement sQLiteStatement = (SQLiteStatement) obj;
                int intValue4 = ((Integer) obj3).intValue();
                ChatSettings chatSettings = ((com.vk.im.engine.models.dialogs.b) obj2).z;
                rdi.j(sQLiteStatement, intValue4, chatSettings != null ? Boolean.valueOf(chatSettings.M) : null);
                return s3q0.a;
            case 5:
                ((SQLiteStatement) obj).bindLong(((Integer) obj3).intValue(), ((com.vk.im.engine.models.dialogs.b) obj2).f.b);
                return s3q0.a;
            default:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                aVar4.K(81482596);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(81482596, intValue5, -1, "com.vk.music.stickyplayer.presentation.components.TopPlayerControls.Right.PodcastButtons.Content.<anonymous>.<anonymous> (TopPlayerControls.kt:618)");
                }
                if (booleanValue) {
                    aVar4.K(995365547);
                    qzu0.a.getClass();
                    d1 = qzu0.V0(aVar4);
                } else {
                    aVar4.K(995366218);
                    qzu0.a.getClass();
                    d1 = qzu0.d1(aVar4);
                }
                aVar4.j();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar4.j();
                return d1;
        }
    }
}
