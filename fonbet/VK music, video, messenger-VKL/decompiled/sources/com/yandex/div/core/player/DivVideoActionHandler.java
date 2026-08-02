package com.yandex.div.core.player;

import com.yandex.div.core.view2.Div2View;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;
import com.yandex.div.internal.core.DivCollectionExtensionsKt;
import com.yandex.div.internal.core.DivItemBuilderResult;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivContainer;
import com.yandex.div2.DivGallery;
import com.yandex.div2.DivPager;
import com.yandex.div2.DivTabs;
import com.yandex.div2.a;
import com.yandex.div2.b5;
import com.yandex.div2.g3;
import com.yandex.div2.j3;
import com.yandex.div2.ma;
import com.yandex.div2.rd;
import java.util.Iterator;
import java.util.List;
import xsna.epx;
import xsna.ikn;
import xsna.zcl;

/* compiled from: DivVideoActionHandler.kt */
/* loaded from: classes7.dex */
public final class DivVideoActionHandler {
    public static final Companion Companion = new Companion(null);
    private final DivVideoViewMapper videoViewMapper;

    /* compiled from: DivVideoActionHandler.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    public DivVideoActionHandler(DivVideoViewMapper divVideoViewMapper) {
        this.videoViewMapper = divVideoViewMapper;
    }

    private final rd findDivVideoWithId(ikn iknVar, String str, ExpressionResolver expressionResolver) {
        ikn b;
        rd findDivVideoWithId;
        if (iknVar instanceof rd) {
            if (epx.f(((rd) iknVar).t, str)) {
                return (rd) iknVar;
            }
            return null;
        }
        if (iknVar instanceof DivGallery) {
            for (DivItemBuilderResult divItemBuilderResult : DivCollectionExtensionsKt.buildItems((DivGallery) iknVar, expressionResolver)) {
                rd findDivVideoWithId2 = findDivVideoWithId(divItemBuilderResult.component1().b(), str, divItemBuilderResult.component2());
                if (findDivVideoWithId2 != null) {
                    return findDivVideoWithId2;
                }
            }
            return null;
        }
        if (iknVar instanceof DivContainer) {
            for (DivItemBuilderResult divItemBuilderResult2 : DivCollectionExtensionsKt.buildItems((DivContainer) iknVar, expressionResolver)) {
                rd findDivVideoWithId3 = findDivVideoWithId(divItemBuilderResult2.component1().b(), str, divItemBuilderResult2.component2());
                if (findDivVideoWithId3 != null) {
                    return findDivVideoWithId3;
                }
            }
            return null;
        }
        if (iknVar instanceof b5) {
            Iterator<T> it = DivCollectionExtensionsKt.getNonNullItems((b5) iknVar).iterator();
            while (it.hasNext()) {
                rd findDivVideoWithId4 = findDivVideoWithId(((a) it.next()).b(), str, expressionResolver);
                if (findDivVideoWithId4 != null) {
                    return findDivVideoWithId4;
                }
            }
            return null;
        }
        if (iknVar instanceof DivPager) {
            for (DivItemBuilderResult divItemBuilderResult3 : DivCollectionExtensionsKt.buildItems((DivPager) iknVar, expressionResolver)) {
                rd findDivVideoWithId5 = findDivVideoWithId(divItemBuilderResult3.component1().b(), str, divItemBuilderResult3.component2());
                if (findDivVideoWithId5 != null) {
                    return findDivVideoWithId5;
                }
            }
            return null;
        }
        if (iknVar instanceof DivTabs) {
            Iterator<T> it2 = ((DivTabs) iknVar).q.iterator();
            while (it2.hasNext()) {
                rd findDivVideoWithId6 = findDivVideoWithId(((DivTabs.a) it2.next()).a.b(), str, expressionResolver);
                if (findDivVideoWithId6 != null) {
                    return findDivVideoWithId6;
                }
            }
            return null;
        }
        if (iknVar instanceof g3) {
            List<a> list = ((g3) iknVar).q;
            if (list != null) {
                Iterator<T> it3 = list.iterator();
                while (it3.hasNext()) {
                    rd findDivVideoWithId7 = findDivVideoWithId(((a) it3.next()).b(), str, expressionResolver);
                    if (findDivVideoWithId7 != null) {
                        return findDivVideoWithId7;
                    }
                }
            }
            return null;
        }
        if (iknVar instanceof ma) {
            Iterator<T> it4 = ((ma) iknVar).I.iterator();
            while (it4.hasNext()) {
                a aVar = ((ma.a) it4.next()).c;
                if (aVar != null && (b = aVar.b()) != null && (findDivVideoWithId = findDivVideoWithId(b, str, expressionResolver)) != null) {
                    return findDivVideoWithId;
                }
            }
        }
        return null;
    }

    private final rd searchDivDataForVideo(j3 j3Var, String str, ExpressionResolver expressionResolver) {
        Iterator<T> it = j3Var.c.iterator();
        while (it.hasNext()) {
            rd findDivVideoWithId = findDivVideoWithId(((j3.b) it.next()).a.b(), str, expressionResolver);
            if (findDivVideoWithId != null) {
                return findDivVideoWithId;
            }
        }
        return null;
    }

    public final boolean handleAction(Div2View div2View, String str, String str2, ExpressionResolver expressionResolver) {
        rd searchDivDataForVideo;
        DivPlayer player;
        j3 divData = div2View.getDivData();
        if (divData == null || (searchDivDataForVideo = searchDivDataForVideo(divData, str, expressionResolver)) == null || (player = this.videoViewMapper.getPlayer(searchDivDataForVideo)) == null) {
            return false;
        }
        if (epx.f(str2, "start")) {
            player.play();
            return true;
        }
        if (epx.f(str2, "pause")) {
            player.pause();
            return true;
        }
        KAssert kAssert = KAssert.INSTANCE;
        if (Assert.isEnabled()) {
            Assert.fail("No such video action: " + str2);
        }
        return false;
    }
}
