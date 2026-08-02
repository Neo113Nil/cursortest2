package xsna;

import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.api.generated.friends.dto.FriendsRecDescriptionContentTypeDto;
import com.vk.api.generated.friends.dto.FriendsRecDescriptionGenericDto;
import com.vk.api.generated.friends.dto.FriendsRecDescriptionIconDto;
import com.vk.dto.user.ProfileDescription;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: FriendsRecDescriptionGenericDtoToProfileDescriptionMapper.kt */
/* loaded from: classes3.dex */
public final class srs {
    public final ne6 a = new ne6();

    /* compiled from: FriendsRecDescriptionGenericDtoToProfileDescriptionMapper.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[FriendsRecDescriptionIconDto.values().length];
            try {
                iArr[FriendsRecDescriptionIconDto.EDUCATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[FriendsRecDescriptionContentTypeDto.values().length];
            try {
                iArr2[FriendsRecDescriptionContentTypeDto.IMAGES.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[FriendsRecDescriptionContentTypeDto.TEXT.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[FriendsRecDescriptionContentTypeDto.ICON.ordinal()] = 3;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public final ProfileDescription a(FriendsRecDescriptionGenericDto friendsRecDescriptionGenericDto) {
        ProfileDescription.Type type;
        ArrayList arrayList = null;
        if (!(friendsRecDescriptionGenericDto instanceof FriendsRecDescriptionGenericDto.FriendsRecDescriptionDto)) {
            if (friendsRecDescriptionGenericDto instanceof FriendsRecDescriptionGenericDto.StringWrapper) {
                return new ProfileDescription(ProfileDescription.Type.TEXT, null, null, ((FriendsRecDescriptionGenericDto.StringWrapper) friendsRecDescriptionGenericDto).b);
            }
            throw new NoWhenBranchMatchedException();
        }
        FriendsRecDescriptionGenericDto.FriendsRecDescriptionDto friendsRecDescriptionDto = (FriendsRecDescriptionGenericDto.FriendsRecDescriptionDto) friendsRecDescriptionGenericDto;
        int i = a.$EnumSwitchMapping$1[friendsRecDescriptionDto.d().ordinal()];
        if (i == 1) {
            type = ProfileDescription.Type.IMAGES;
        } else if (i == 2) {
            type = ProfileDescription.Type.TEXT;
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            type = ProfileDescription.Type.ICON;
        }
        FriendsRecDescriptionIconDto e = friendsRecDescriptionDto.e();
        ProfileDescription.Icon icon = (e == null ? -1 : a.$EnumSwitchMapping$0[e.ordinal()]) == 1 ? ProfileDescription.Icon.EDUCATION : null;
        List<List<BaseImageDto>> f = friendsRecDescriptionDto.f();
        if (f != null) {
            List<List<BaseImageDto>> list = f;
            arrayList = new ArrayList(c5g.u(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                List list2 = (List) it.next();
                this.a.getClass();
                arrayList.add(ne6.a(list2));
            }
        }
        return new ProfileDescription(type, icon, arrayList, friendsRecDescriptionDto.g());
    }
}
