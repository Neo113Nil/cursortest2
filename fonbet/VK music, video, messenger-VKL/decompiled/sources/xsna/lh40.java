package xsna;

import android.content.Context;
import com.vk.dto.group.Group;
import com.vk.dto.group.GroupSuggestion;
import com.vk.dto.music.audiobook.AudioBook;
import com.vk.dto.music.audiobook.AudioBookChapter;
import com.vk.photo.editor.features.collage.model.stat.CollageStatEvent;
import com.vk.stat.scheme.MobileOfficialAppsCorePhotoEditorStat$CollageEvent;
import com.vk.stat.scheme.MobileOfficialAppsCorePhotoEditorStat$PhotoParams;
import com.vk.stat.scheme.MobileOfficialAppsCorePhotoEditorStat$TypePhotoEditorItem;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class lh40 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ lh40(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        MobileOfficialAppsCorePhotoEditorStat$PhotoParams.Ratio ratio;
        switch (this.b) {
            case 0:
                ((vh40) this.c).h((Context) this.d, (AudioBook) this.e, (AudioBookChapter) this.f);
                return s3q0.a;
            case 1:
                o6a0 o6a0Var = (o6a0) this.c;
                CollageStatEvent.Format format = (CollageStatEvent.Format) this.d;
                String str = (String) this.e;
                MobileOfficialAppsCorePhotoEditorStat$CollageEvent mobileOfficialAppsCorePhotoEditorStat$CollageEvent = (MobileOfficialAppsCorePhotoEditorStat$CollageEvent) this.f;
                MobileOfficialAppsCorePhotoEditorStat$TypePhotoEditorItem.MediaType mediaType = MobileOfficialAppsCorePhotoEditorStat$TypePhotoEditorItem.MediaType.COLLAGE;
                o6a0Var.getClass();
                String a = o6a0Var.b.a();
                if (format != null) {
                    switch (h2g.$EnumSwitchMapping$0[format.ordinal()]) {
                        case 1:
                            ratio = MobileOfficialAppsCorePhotoEditorStat$PhotoParams.Ratio.ORIGINAL;
                            break;
                        case 2:
                            ratio = MobileOfficialAppsCorePhotoEditorStat$PhotoParams.Ratio.FREE;
                            break;
                        case 3:
                            ratio = MobileOfficialAppsCorePhotoEditorStat$PhotoParams.Ratio.ONE_TO_ONE;
                            break;
                        case 4:
                            ratio = MobileOfficialAppsCorePhotoEditorStat$PhotoParams.Ratio.THREE_TO_FOUR;
                            break;
                        case 5:
                            ratio = MobileOfficialAppsCorePhotoEditorStat$PhotoParams.Ratio.FOUR_TO_THREE;
                            break;
                        case 6:
                            ratio = MobileOfficialAppsCorePhotoEditorStat$PhotoParams.Ratio.SIXTEEN_TO_NINE;
                            break;
                        case 7:
                            ratio = MobileOfficialAppsCorePhotoEditorStat$PhotoParams.Ratio.NINE_TO_SIXTEEN;
                            break;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                } else {
                    ratio = null;
                }
                return new MobileOfficialAppsCorePhotoEditorStat$TypePhotoEditorItem(mediaType, a, null, null, null, null, null, null, mobileOfficialAppsCorePhotoEditorStat$CollageEvent, null, null, null, null, null, null, new MobileOfficialAppsCorePhotoEditorStat$PhotoParams(null, null, null, null, null, null, null, null, null, null, null, null, ratio, null, null, null, null, str, null, null, null, null, null, null, null, null, null, null, null, null, null, 2147348479, null), 32504, null);
            default:
                ((q3n0) this.c).c((GroupSuggestion) this.d, (Group) this.e, (String) this.f, false, null);
                return s3q0.a;
        }
    }
}
