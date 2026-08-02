package xsna;

import com.vk.api.generated.account.dto.AccountSetInfoNameDto;
import com.vk.im.engine.models.dialogs.FolderType;

/* compiled from: SetFolderCounterSettingApiCmd.kt */
/* loaded from: classes18.dex */
public final class oyi0 extends nx2<s3q0> {
    public final FolderType b;
    public final boolean c;
    public final boolean d = true;

    public oyi0(FolderType folderType, boolean z) {
        this.b = folderType;
        this.c = z;
    }

    @Override // xsna.nx2
    public final s3q0 f(l7r0 l7r0Var) {
        AccountSetInfoNameDto accountSetInfoNameDto;
        es esVar = new es();
        FolderType folderType = this.b;
        String j = folderType.j();
        if (epx.f(j, FolderType.CHANNELS.j())) {
            accountSetInfoNameDto = AccountSetInfoNameDto.MESSAGES_COUNTER_SETTINGS_INCLUDE_CHANNELS;
        } else {
            if (!epx.f(j, FolderType.MANAGED_GROUPS.j())) {
                throw new UnsupportedOperationException("Unsupported folder type " + folderType);
            }
            accountSetInfoNameDto = AccountSetInfoNameDto.MESSAGES_COUNTER_SETTINGS_INCLUDE_GROUP_DIALOGS;
        }
        bz2.n(esVar.g(accountSetInfoNameDto, this.c ? "1" : "0"), new ape0(this, 5)).f(l7r0Var);
        return s3q0.a;
    }
}
