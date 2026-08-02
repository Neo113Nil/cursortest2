package xsna;

import android.content.Intent;
import android.net.Uri;
import android.os.SystemClock;
import com.vk.core.serialize.Serializer;
import com.vk.dto.user.UserProfile;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction$TechStats$Picker$SaveInteractiveTime;
import com.vk.newsfeed.posting.mediapicker.localmedia.LocalMediaPickerFragmentOld;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$PickerType;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class gb0 implements Callable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ gb0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        File u;
        ArrayList arrayList;
        byte[] readAllBytes;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                Uri uri = (Uri) ((Intent) obj).getParcelableExtra("result_file");
                if (uri == null || (u = up2.u(uri)) == null) {
                    return new ArrayList();
                }
                FileInputStream fileInputStream = new FileInputStream(u);
                try {
                    try {
                        HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap = Serializer.a;
                        readAllBytes = fileInputStream.readAllBytes();
                        arrayList = Serializer.b.b(readAllBytes, UserProfile.class.getClassLoader());
                        u.delete();
                    } catch (Throwable unused) {
                        arrayList = new ArrayList();
                    }
                    fileInputStream.close();
                    return arrayList;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        ro.e(fileInputStream, th);
                        throw th2;
                    }
                }
            case 1:
                ((LocalMediaPickerFragmentOld) obj).Y.invoke(new PostingAction$TechStats$Picker$SaveInteractiveTime(MobileOfficialAppsFeedStat$PickerType.PHOTO, SystemClock.elapsedRealtime()));
                return s3q0.a;
            default:
                return r6e0.b().a((List) obj);
        }
    }

    public /* synthetic */ gb0(r6e0 r6e0Var, List list) {
        this.b = 2;
        this.c = list;
    }
}
