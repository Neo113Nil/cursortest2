package xsna;

import com.vk.photo.editor.features.markup.text.model.stat.TextStatEvent;
import com.vk.stat.scheme.MobileOfficialAppsCorePhotoEditorStat$TextData;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: TextStatExt.kt */
/* loaded from: classes15.dex */
public final class vlo0 {

    /* compiled from: TextStatExt.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TextStatEvent.Align.values().length];
            try {
                iArr[TextStatEvent.Align.Start.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TextStatEvent.Align.Center.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TextStatEvent.Align.End.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final MobileOfficialAppsCorePhotoEditorStat$TextData a(TextStatEvent.e eVar) {
        MobileOfficialAppsCorePhotoEditorStat$TextData.Align align;
        int i = a.$EnumSwitchMapping$0[eVar.a.ordinal()];
        if (i == 1) {
            align = MobileOfficialAppsCorePhotoEditorStat$TextData.Align.LEFT;
        } else if (i == 2) {
            align = MobileOfficialAppsCorePhotoEditorStat$TextData.Align.CENTER;
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            align = MobileOfficialAppsCorePhotoEditorStat$TextData.Align.RIGHT;
        }
        return new MobileOfficialAppsCorePhotoEditorStat$TextData(align, Integer.valueOf(eVar.c), eVar.b, eVar.d, blk.V(eVar.e.a()), blk.V(eVar.f.a()));
    }
}
