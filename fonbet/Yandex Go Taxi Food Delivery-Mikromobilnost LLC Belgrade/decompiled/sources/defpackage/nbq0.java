package defpackage;

import com.yandex.messaging.ui.folders.selectDialog.SelectFolderDialogFragment;

/* loaded from: classes15.dex */
public final /* synthetic */ class nbq0 implements wls {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ SelectFolderDialogFragment b;
    public final /* synthetic */ f530 c;
    public final /* synthetic */ sls w;
    public final /* synthetic */ int x;
    public final /* synthetic */ int y;

    public /* synthetic */ nbq0(SelectFolderDialogFragment selectFolderDialogFragment, sls slsVar, f530 f530Var, int i, int i2) {
        this.b = selectFolderDialogFragment;
        this.w = slsVar;
        this.c = f530Var;
        this.x = i;
        this.y = i2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        zy11 CreateFolderListItem$lambda$17;
        zy11 SelectFolderDialogRoot$lambda$3;
        switch (this.a) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                CreateFolderListItem$lambda$17 = SelectFolderDialogFragment.CreateFolderListItem$lambda$17(this.b, this.w, this.c, this.x, this.y, (fid) obj, intValue);
                return CreateFolderListItem$lambda$17;
            default:
                int intValue2 = ((Integer) obj2).intValue();
                SelectFolderDialogFragment selectFolderDialogFragment = this.b;
                sls slsVar = this.w;
                SelectFolderDialogRoot$lambda$3 = SelectFolderDialogFragment.SelectFolderDialogRoot$lambda$3(selectFolderDialogFragment, this.c, slsVar, this.x, this.y, (fid) obj, intValue2);
                return SelectFolderDialogRoot$lambda$3;
        }
    }

    public /* synthetic */ nbq0(SelectFolderDialogFragment selectFolderDialogFragment, f530 f530Var, sls slsVar, int i, int i2) {
        this.b = selectFolderDialogFragment;
        this.c = f530Var;
        this.w = slsVar;
        this.x = i;
        this.y = i2;
    }
}
