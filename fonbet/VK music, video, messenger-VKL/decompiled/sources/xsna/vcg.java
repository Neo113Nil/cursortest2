package xsna;

import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.wall.dto.WallRestoreThreadResponseDto;
import com.vk.lists.ListDataSet;
import com.vk.newsfeed.api.data.NewsComment;
import java.util.ArrayList;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class vcg implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ mdg c;
    public final /* synthetic */ iag d;

    public /* synthetic */ vcg(mdg mdgVar, iag iagVar, int i) {
        this.b = i;
        this.c = mdgVar;
        this.d = iagVar;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [com.vk.core.fragments.FragmentImpl, xsna.bfg] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                if (((BaseOkResponseDto) obj).i() == BaseOkResponseDto.OK.i()) {
                    this.c.e8(this.d.getUid(), true);
                }
                break;
            default:
                if (((WallRestoreThreadResponseDto) obj).d()) {
                    mdg mdgVar = this.c;
                    ?? r0 = mdgVar.e;
                    ListDataSet<cbg> listDataSet = mdgVar.K;
                    int size = listDataSet.d.size();
                    int i = 0;
                    while (true) {
                        if (i < size) {
                            cbg c = listDataSet.c(i);
                            if (c != null) {
                                iag iagVar = c.a;
                                if (iagVar instanceof NewsComment) {
                                    NewsComment newsComment = (NewsComment) iagVar;
                                    int i2 = newsComment.i;
                                    iag iagVar2 = this.d;
                                    if (i2 == iagVar2.getId()) {
                                        newsComment.u = false;
                                        mdgVar.L7(iagVar);
                                        newsComment.v = false;
                                        ArrayList V2 = mdgVar.V2(newsComment);
                                        listDataSet.A(i);
                                        listDataSet.y(i, V2);
                                        r0.bm(iagVar2.getId());
                                        r0.Rb(i);
                                        mdgVar.h1(iagVar2);
                                    }
                                } else {
                                    continue;
                                }
                            }
                            i++;
                        }
                    }
                }
                break;
        }
        return s3q0.a;
    }
}
