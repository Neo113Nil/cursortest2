package xsna;

import com.vk.api.generated.messages.dto.MessagesGetRecommendedFoldersResponseDto;
import com.vk.api.generated.messages.dto.MessagesGetRecommendedFoldersSupportedTypesDto;
import com.vk.im.engine.models.dialogs.FoldersSupportedType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: MessagesGetRecommendedFoldersApiCmd.kt */
/* loaded from: classes18.dex */
public final class gf20 extends nx2<MessagesGetRecommendedFoldersResponseDto> {
    public final List<FoldersSupportedType> b;
    public final boolean c;

    /* compiled from: MessagesGetRecommendedFoldersApiCmd.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FoldersSupportedType.values().length];
            try {
                iArr[FoldersSupportedType.CHANNELS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FoldersSupportedType.BUSINESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FoldersSupportedType.PERSONAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FoldersSupportedType.MANAGED_GROUPS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public gf20(List<? extends FoldersSupportedType> list, boolean z) {
        this.b = list;
        this.c = z;
    }

    @Override // xsna.nx2
    public final MessagesGetRecommendedFoldersResponseDto f(l7r0 l7r0Var) {
        MessagesGetRecommendedFoldersSupportedTypesDto messagesGetRecommendedFoldersSupportedTypesDto;
        List<FoldersSupportedType> list = this.b;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            int i = a.$EnumSwitchMapping$0[((FoldersSupportedType) it.next()).ordinal()];
            if (i == 1) {
                messagesGetRecommendedFoldersSupportedTypesDto = MessagesGetRecommendedFoldersSupportedTypesDto.CHANNELS;
            } else if (i == 2) {
                messagesGetRecommendedFoldersSupportedTypesDto = MessagesGetRecommendedFoldersSupportedTypesDto.BUSINESS;
            } else if (i == 3) {
                messagesGetRecommendedFoldersSupportedTypesDto = MessagesGetRecommendedFoldersSupportedTypesDto.PERSONAL;
            } else {
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                messagesGetRecommendedFoldersSupportedTypesDto = MessagesGetRecommendedFoldersSupportedTypesDto.MANAGED_GROUPS;
            }
            arrayList.add(messagesGetRecommendedFoldersSupportedTypesDto);
        }
        ArrayList arrayList2 = null;
        if (arrayList.isEmpty()) {
            arrayList = null;
        }
        tfx tfxVar = new tfx("messages.getRecommendedFolders", new cr(20), new io.reactivex.rxjava3.internal.operators.observable.n0(29));
        if (arrayList != null) {
            arrayList2 = new ArrayList(c5g.u(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((MessagesGetRecommendedFoldersSupportedTypesDto) it2.next()).i());
            }
        }
        if (arrayList2 != null) {
            tfxVar.i("supported_types", arrayList2);
        }
        return (MessagesGetRecommendedFoldersResponseDto) ((az2) bz2.n(tfxVar, new u3u(this, 9)).c).invoke(l7r0Var);
    }
}
