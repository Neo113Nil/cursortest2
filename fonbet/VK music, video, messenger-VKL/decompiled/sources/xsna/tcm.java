package xsna;

import com.vk.dto.common.ImageSize;
import com.vk.dto.photo.Photo;
import io.requery.android.database.sqlite.SQLiteStatement;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class tcm implements yzs {
    public final /* synthetic */ int b;

    public /* synthetic */ tcm(int i) {
        this.b = i;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ImageSize Ab;
        switch (this.b) {
            case 0:
                ((SQLiteStatement) obj).bindString(((Integer) obj3).intValue(), kvf.a(((com.vk.im.engine.models.dialogs.b) obj2).V).toString());
                return s3q0.a;
            default:
                Photo photo = (Photo) obj;
                int intValue = ((Integer) obj2).intValue();
                int intValue2 = ((Integer) obj3).intValue();
                if (photo == null || (Ab = photo.Ab(intValue, intValue2)) == null) {
                    return null;
                }
                return Ab.d.d;
        }
    }
}
