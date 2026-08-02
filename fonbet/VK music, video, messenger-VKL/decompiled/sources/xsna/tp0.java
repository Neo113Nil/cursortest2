package xsna;

import android.os.Parcelable;
import com.vk.api.generated.users.dto.UsersFieldsDto;
import com.vk.documents.impl.ui.fragments.AttachDocumentsFragment;
import com.vk.dto.common.VideoFile;
import com.vkontakte.android.fragments.videos.AddedVideosFragment;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import xsna.r1r0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class tp0 implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ tp0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                AddedVideosFragment addedVideosFragment = (AddedVideosFragment) obj2;
                int i2 = AddedVideosFragment.n1;
                if (!(obj instanceof paq0)) {
                    if (obj instanceof cwr0) {
                        VideoFile videoFile = ((cwr0) obj).a;
                        if (addedVideosFragment.f0 && videoFile != null) {
                            addedVideosFragment.Oo(videoFile);
                            break;
                        }
                    }
                } else {
                    Parcelable parcelable = ((paq0) obj).b;
                    if (parcelable instanceof VideoFile) {
                        VideoFile videoFile2 = (VideoFile) parcelable;
                        if (videoFile2.I0() == addedVideosFragment.O0 && addedVideosFragment.f0) {
                            io.reactivex.rxjava3.disposables.b bVar = addedVideosFragment.j1;
                            u1r0 u1r0Var = addedVideosFragment.k1;
                            List asList = Arrays.asList(videoFile2.I0());
                            Object[] objArr = {UsersFieldsDto.PHOTO_BASE};
                            ArrayList arrayList = new ArrayList(1);
                            Object obj3 = objArr[0];
                            Objects.requireNonNull(obj3);
                            arrayList.add(obj3);
                            List unmodifiableList = Collections.unmodifiableList(arrayList);
                            u1r0Var.getClass();
                            io.reactivex.rxjava3.internal.operators.observable.f0 W = rsg0.W(yfb.x(r1r0.a.a(asList, null, unmodifiableList, null, null)), 7);
                            up0 up0Var = new up0(0, addedVideosFragment, videoFile2);
                            com.vk.metrics.eventtracking.b bVar2 = com.vk.metrics.eventtracking.b.a;
                            Objects.requireNonNull(bVar2);
                            bVar.b(W.subscribe(up0Var, new le50(bVar2, 25)));
                            break;
                        }
                    }
                }
                break;
            case 1:
                int i3 = AttachDocumentsFragment.R0;
                ((zx0) obj2).invoke(obj);
                break;
            case 2:
                ((zx0) obj2).invoke(obj);
                break;
            case 3:
                ((zx0) obj2).invoke(obj);
                break;
            case 4:
                ((com.vk.channels.impl.comments.b) obj2).u((Throwable) obj);
                break;
            case 5:
                ((zx0) obj2).invoke(obj);
                break;
            case 6:
                ((zx0) obj2).invoke(obj);
                break;
            case 7:
                ((zx0) obj2).invoke(obj);
                break;
            case 8:
                ((zx0) obj2).invoke(obj);
                break;
            case 9:
                ((zx0) obj2).invoke(obj);
                break;
            case 10:
                ((gv3) obj2).invoke(obj);
                break;
            case 11:
                ((r8) obj2).invoke(obj);
                break;
            case 12:
                ((eue) obj2).invoke(obj);
                break;
            case 13:
                ((zx0) obj2).invoke(obj);
                break;
            case 14:
                ((gv3) obj2).invoke(obj);
                break;
            case 15:
                ((zx0) obj2).invoke(obj);
                break;
            case 16:
                ((zx0) obj2).invoke(obj);
                break;
            case 17:
                ((zx0) obj2).invoke(obj);
                break;
            case 18:
                ((zx0) obj2).invoke(obj);
                break;
            case 19:
                ((t50) obj2).invoke(obj);
                break;
            case 20:
                ((s6k) obj2).invoke(obj);
                break;
            case 21:
                ((gv3) obj2).invoke(obj);
                break;
            case 22:
                ((nu2) obj2).invoke(obj);
                break;
            case 23:
                ((s6k) obj2).invoke(obj);
                break;
            case 24:
                ((s6k) obj2).invoke(obj);
                break;
            case 25:
                ((s6k) obj2).invoke(obj);
                break;
            case 26:
                ((s6k) obj2).invoke(obj);
                break;
            case 27:
                ((gv3) obj2).invoke(obj);
                break;
            case 28:
                ((mp3) obj2).invoke(obj);
                break;
            default:
                ((s6k) obj2).invoke(obj);
                break;
        }
    }
}
