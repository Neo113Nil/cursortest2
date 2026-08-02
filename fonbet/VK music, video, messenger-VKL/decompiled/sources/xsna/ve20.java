package xsna;

import com.vk.api.generated.messages.dto.MessagesFoldersInfoDto;
import com.vk.api.generated.messages.dto.MessagesGetFoldersSupportedTypesDto;
import com.vk.im.engine.models.dialogs.FoldersSupportedType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: MessagesGetFoldersApiCmd.kt */
/* loaded from: classes2.dex */
public final class ve20 extends nx2<MessagesFoldersInfoDto> {
    public final boolean b = true;
    public final List<FoldersSupportedType> c;
    public final boolean d;

    /* compiled from: MessagesGetFoldersApiCmd.kt */
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

    public ve20(List list, boolean z) {
        this.c = list;
        this.d = z;
    }

    @Override // xsna.nx2
    public final MessagesFoldersInfoDto f(l7r0 l7r0Var) {
        MessagesGetFoldersSupportedTypesDto messagesGetFoldersSupportedTypesDto;
        List<FoldersSupportedType> list = this.c;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            int i = a.$EnumSwitchMapping$0[((FoldersSupportedType) it.next()).ordinal()];
            if (i == 1) {
                messagesGetFoldersSupportedTypesDto = MessagesGetFoldersSupportedTypesDto.CHANNELS;
            } else if (i == 2) {
                messagesGetFoldersSupportedTypesDto = MessagesGetFoldersSupportedTypesDto.BUSINESS;
            } else if (i == 3) {
                messagesGetFoldersSupportedTypesDto = MessagesGetFoldersSupportedTypesDto.PERSONAL;
            } else {
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                messagesGetFoldersSupportedTypesDto = MessagesGetFoldersSupportedTypesDto.MANAGED_GROUPS;
            }
            arrayList.add(messagesGetFoldersSupportedTypesDto);
        }
        ArrayList arrayList2 = null;
        if (arrayList.isEmpty()) {
            arrayList = null;
        }
        tfx tfxVar = new tfx("messages.getFolders", new bo(24), new sr(17));
        tfxVar.j("with_peers", this.b);
        if (arrayList != null) {
            arrayList2 = new ArrayList(c5g.u(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((MessagesGetFoldersSupportedTypesDto) it2.next()).i());
            }
        }
        if (arrayList2 != null) {
            tfxVar.i("supported_types", arrayList2);
        }
        return (MessagesFoldersInfoDto) ((az2) bz2.n(tfxVar, new vfk(this, 27)).c).invoke(l7r0Var);
    }
}
