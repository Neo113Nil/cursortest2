package xsna;

import com.vk.im.engine.models.dialogs.BusinessNotifyInfo;
import com.vk.libvideo.bottomsheet.about.delegate.AboutVideoItem;
import com.vk.video.polls.entrypoint.model.UxPollEntryPoint;
import io.requery.android.database.sqlite.SQLiteStatement;
import java.util.Collections;
import java.util.Optional;
import kotlin.collections.EmptyList;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class rcm implements yzs {
    public final /* synthetic */ int b;

    public /* synthetic */ rcm(int i) {
        this.b = i;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.b) {
            case 0:
                SQLiteStatement sQLiteStatement = (SQLiteStatement) obj;
                int intValue = ((Integer) obj3).intValue();
                BusinessNotifyInfo businessNotifyInfo = ((com.vk.im.engine.models.dialogs.b) obj2).M;
                rdi.k(sQLiteStatement, intValue, businessNotifyInfo != null ? Integer.valueOf(businessNotifyInfo.d) : null);
                return s3q0.a;
            default:
                Optional optional = (Optional) obj2;
                boolean z = ((Boolean) obj).booleanValue() && !((Boolean) obj3).booleanValue();
                UxPollEntryPoint uxPollEntryPoint = (UxPollEntryPoint) optional.orElse(null);
                return (!z || uxPollEntryPoint == null) ? EmptyList.b : Collections.singletonList(new AboutVideoItem.b0(uxPollEntryPoint));
        }
    }
}
