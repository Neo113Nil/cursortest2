package xsna;

import android.os.Parcelable;
import com.ironsource.X3;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.vk.core.serialize.Serializer;
import com.vk.dzenarticle.impl.domain.DzenArticle;
import com.vk.dzenarticle.impl.ui.entity.items.ArticleAdItem;
import com.vk.dzenarticle.impl.ui.entity.items.ArticleEmbedItem;
import com.vk.dzenarticle.impl.ui.entity.items.ArticleImageItem;
import com.vk.dzenarticle.impl.ui.entity.items.ArticleItem;
import com.vk.dzenarticle.impl.ui.entity.items.ArticleSpaceItem;
import com.vk.dzenarticle.impl.ui.entity.items.ArticleTextItem;
import com.vk.dzenarticle.impl.ui.entity.items.ArticleWebviewItem;
import com.vk.feed.core.models.NewsfeedResearch;
import io.jsonwebtoken.JwtParser;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.ok.android.externcalls.analytics.internal.storage.DatabaseHelper;
import xsna.ij20;
import xsna.k7r0;

/* compiled from: DzenArticleInteractor.kt */
@b6l(c = "com.vk.dzenarticle.impl.domain.DzenArticleInteractorImpl$getArticle$2", f = "DzenArticleInteractor.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes18.dex */
public final class pro extends SuspendLambda implements wzs<yvj, spj<? super DzenArticle>, Object> {
    final /* synthetic */ String $articleId;
    int label;
    final /* synthetic */ qro this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pro(qro qroVar, String str, spj<? super pro> spjVar) {
        super(2, spjVar);
        this.this$0 = qroVar;
        this.$articleId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new pro(this.this$0, this.$articleId, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super DzenArticle> spjVar) {
        return ((pro) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x039f A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        JSONObject optJSONObject;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        NewsfeedResearch newsfeedResearch;
        JSONObject optJSONObject2;
        JSONObject optJSONObject3;
        JSONArray optJSONArray;
        String str;
        String str2;
        boolean z;
        Integer num;
        String str3;
        int i;
        Parcelable articleTextItem;
        Boolean q;
        Boolean q2;
        Boolean q3;
        Boolean q4;
        Boolean q5;
        JSONObject optJSONObject4;
        String D;
        String D2;
        String D3;
        String D4;
        String D5;
        Parcelable parcelable;
        Parcelable articleSpaceItem;
        boolean z2;
        boolean z3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        qro qroVar = this.this$0;
        String str4 = this.$articleId;
        qroVar.getClass();
        if (drm0.M(str4, new char[]{' ', '/', ':', JwtParser.SEPARATOR_CHAR, '?', '&'}, 0, false) != -1 || str4.length() > 100) {
            throw new IllegalArgumentException("Wrong article id format");
        }
        if (((Boolean) this.this$0.b.getValue()).booleanValue()) {
            tkv tkvVar = new tkv("https://dzen.ru/api/v3/launcher/article/" + this.$articleId, false, 14);
            vx2.a.getClass();
            optJSONObject = (JSONObject) vx2.b().o(tkvVar, a.b);
        } else {
            ij20.a aVar = new ij20.a();
            aVar.c = "newsfeed.getDzenBlockItem";
            aVar.b("dzen_id", this.$articleId);
            aVar.g = 0;
            ij20 ij20Var = new ij20(aVar);
            vx2.a.getClass();
            optJSONObject = ((JSONObject) vx2.b().d(ij20Var, b.b)).optJSONObject("response");
        }
        vro vroVar = this.this$0.a;
        if (optJSONObject == null || (jSONObject = optJSONObject.optJSONObject(DatabaseHelper.ITEM_COLUMN_NAME)) == null) {
            jSONObject = new JSONObject();
        }
        if (optJSONObject == null || (jSONObject2 = optJSONObject.optJSONObject("channel_info")) == null) {
            jSONObject2 = new JSONObject();
        }
        String optString = jSONObject.optString("id");
        String optString2 = jSONObject.optString("publisher_id");
        String optString3 = jSONObject.optString("title");
        String optString4 = jSONObject.optString("url");
        String optString5 = jSONObject.optString("published_at_formatted");
        boolean optBoolean = jSONObject.optBoolean("is_banned");
        Integer x = f370.x(jSONObject, "views");
        ArrayList arrayList = new ArrayList();
        JSONObject optJSONObject5 = jSONObject.optJSONObject(HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT);
        if (optJSONObject5 != null && (optJSONObject3 = optJSONObject5.optJSONObject("quill_delta")) != null && (optJSONArray = optJSONObject3.optJSONArray("ops")) != null) {
            int length = optJSONArray.length();
            int i2 = 0;
            while (i2 < length) {
                int i3 = length;
                JSONObject jSONObject3 = optJSONArray.getJSONObject(i2);
                JSONArray jSONArray = optJSONArray;
                String str5 = optString;
                JSONObject optJSONObject6 = jSONObject3.optJSONObject("insert");
                String str6 = optString2;
                String str7 = optString3;
                if (optJSONObject6 == null || !optJSONObject6.has("atomic:image")) {
                    str = optString4;
                    str2 = optString5;
                    z = optBoolean;
                    num = x;
                    if (optJSONObject6 == null || !optJSONObject6.has("atomic:ad")) {
                        if (optJSONObject6 != null && optJSONObject6.has("atomic:embed")) {
                            JSONObject optJSONObject7 = optJSONObject6.optJSONObject("atomic:embed");
                            JSONObject optJSONObject8 = optJSONObject7 != null ? optJSONObject7.optJSONObject(HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT) : null;
                            if (epx.f(optJSONObject8 != null ? f370.D(optJSONObject8, "type") : null, X3.i.K) && (D4 = f370.D(optJSONObject8, "embed_url")) != null && (!drm0.N(D4))) {
                                JSONObject optJSONObject9 = optJSONObject6.optJSONObject("atomic:embed");
                                JSONObject optJSONObject10 = optJSONObject9 != null ? optJSONObject9.optJSONObject(HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT) : null;
                                String D6 = optJSONObject9 != null ? f370.D(optJSONObject9, "title") : null;
                                if (optJSONObject10 != null && (D5 = f370.D(optJSONObject10, "embed_url")) != null) {
                                    i = i2;
                                    articleTextItem = new ArticleWebviewItem(i2, D6, D5, f370.u("ratio", optJSONObject10));
                                    str3 = null;
                                }
                                i = i2;
                                str3 = null;
                                articleTextItem = null;
                            }
                        }
                        if (optJSONObject6 != null && optJSONObject6.has("atomic:embed") && (optJSONObject4 = optJSONObject6.optJSONObject("atomic:embed")) != null && (D = f370.D(optJSONObject4, "title")) != null && (!drm0.N(D))) {
                            JSONObject optJSONObject11 = optJSONObject6.optJSONObject("atomic:embed");
                            if (optJSONObject11 != null && (D2 = f370.D(optJSONObject11, "title")) != null && (D3 = f370.D(optJSONObject11, "url")) != null) {
                                articleTextItem = new ArticleEmbedItem(i2, D2, D3);
                            }
                        } else if (optJSONObject6 == null) {
                            String A = f370.A("insert", jSONObject3);
                            if (epx.f(A, "\n")) {
                                str3 = null;
                                articleTextItem = new ArticleSpaceItem(i2, false, 2, null);
                                i = i2;
                            } else {
                                str3 = null;
                                if (A == null) {
                                    i = i2;
                                    articleTextItem = null;
                                } else {
                                    JSONObject optJSONObject12 = jSONObject3.optJSONObject("attributes");
                                    i = i2;
                                    articleTextItem = new ArticleTextItem(i, A, optJSONObject12 != null ? f370.x(optJSONObject12, "header") : null, (optJSONObject12 == null || (q5 = f370.q(optJSONObject12, TtmlNode.ITALIC)) == null) ? false : q5.booleanValue(), (optJSONObject12 == null || (q4 = f370.q(optJSONObject12, TtmlNode.BOLD)) == null) ? false : q4.booleanValue(), (optJSONObject12 == null || (q3 = f370.q(optJSONObject12, "strike")) == null) ? false : q3.booleanValue(), (optJSONObject12 == null || (q2 = f370.q(optJSONObject12, TtmlNode.UNDERLINE)) == null) ? false : q2.booleanValue(), optJSONObject12 != null ? f370.A("link", optJSONObject12) : null, (optJSONObject12 == null || (q = f370.q(optJSONObject12, "blockquote")) == null) ? false : q.booleanValue(), false);
                                }
                            }
                        }
                        i = i2;
                        str3 = null;
                        articleTextItem = null;
                    } else {
                        JSONObject optJSONObject13 = optJSONObject6.optJSONObject("atomic:ad");
                        articleTextItem = new ArticleAdItem(i2, optJSONObject13 != null ? f370.D(optJSONObject13, "type") : null);
                    }
                    i = i2;
                    str3 = null;
                } else {
                    JSONObject optJSONObject14 = optJSONObject6.optJSONObject("atomic:image");
                    String D7 = optJSONObject14 != null ? f370.D(optJSONObject14, "caption") : null;
                    if (D7 == null) {
                        D7 = "";
                    }
                    if (optJSONObject14 != null) {
                        String D8 = f370.D(optJSONObject14, "url");
                        str = optString4;
                        JSONArray optJSONArray2 = optJSONObject14.optJSONArray("sizes");
                        String str8 = "scale_1200";
                        str2 = optString5;
                        z = optBoolean;
                        if (optJSONArray2 != null) {
                            int length2 = optJSONArray2.length();
                            num = x;
                            int i4 = 0;
                            z2 = false;
                            z3 = false;
                            while (i4 < length2) {
                                int i5 = length2;
                                JSONArray jSONArray2 = optJSONArray2;
                                String D9 = f370.D(optJSONArray2.getJSONObject(i4), "key");
                                if (epx.f(D9, "scale_600")) {
                                    z2 = true;
                                } else if (epx.f(D9, "scale_1200")) {
                                    z3 = true;
                                }
                                i4++;
                                length2 = i5;
                                optJSONArray2 = jSONArray2;
                            }
                        } else {
                            num = x;
                            z2 = false;
                            z3 = false;
                        }
                        if (z2) {
                            str8 = "scale_600";
                        } else if (!z3) {
                            str8 = "orig";
                        }
                        String y = D8 != null ? brm0.y(D8, "{size}", str8) : null;
                        if (y != null) {
                            articleTextItem = new ArticleImageItem(i2, y, D7);
                            i = i2;
                            str3 = null;
                        }
                    } else {
                        str = optString4;
                        str2 = optString5;
                        z = optBoolean;
                        num = x;
                    }
                    i = i2;
                    str3 = null;
                    articleTextItem = null;
                }
                ArticleItem articleItem = (ArticleItem) j5g.k0(arrayList);
                if (articleTextItem instanceof ArticleSpaceItem) {
                    JSONObject optJSONObject15 = jSONObject3.optJSONObject("attributes");
                    if (epx.f(optJSONObject15 != null ? f370.A("list", optJSONObject15) : str3, "bullet") && (articleItem instanceof ArticleTextItem)) {
                        ArticleTextItem articleTextItem2 = (ArticleTextItem) articleItem;
                        parcelable = new ArticleTextItem(articleTextItem2.b, articleTextItem2.c, articleTextItem2.d, articleTextItem2.e, articleTextItem2.f, articleTextItem2.g, articleTextItem2.h, articleTextItem2.i, articleTextItem2.j, true);
                        articleSpaceItem = ((articleTextItem instanceof ArticleTextItem) || ((ArticleTextItem) articleTextItem).d == null || !(articleItem instanceof ArticleSpaceItem)) ? parcelable : new ArticleSpaceItem(((ArticleSpaceItem) articleItem).b, true);
                        if (articleSpaceItem == null) {
                            g5g.J(arrayList);
                            arrayList.add(articleSpaceItem);
                        }
                        arrayList.add(articleTextItem);
                        i2 = i + 1;
                        length = i3;
                        optJSONArray = jSONArray;
                        optString = str5;
                        optString2 = str6;
                        optString3 = str7;
                        optString4 = str;
                        optString5 = str2;
                        optBoolean = z;
                        x = num;
                    }
                }
                parcelable = null;
                if (articleTextItem instanceof ArticleTextItem) {
                }
                if (articleSpaceItem == null) {
                }
                arrayList.add(articleTextItem);
                i2 = i + 1;
                length = i3;
                optJSONArray = jSONArray;
                optString = str5;
                optString2 = str6;
                optString3 = str7;
                optString4 = str;
                optString5 = str2;
                optBoolean = z;
                x = num;
            }
        }
        String str9 = optString;
        String str10 = optString2;
        String str11 = optString3;
        String str12 = optString4;
        String str13 = optString5;
        boolean z4 = optBoolean;
        Integer num2 = x;
        List V = j5g.V(arrayList);
        String optString6 = jSONObject2.optString("title");
        String optString7 = jSONObject2.optString("subtitle");
        String optString8 = jSONObject2.optString("description");
        JSONObject optJSONObject16 = jSONObject2.optJSONObject("logo_sizes");
        String optString9 = optJSONObject16 != null ? optJSONObject16.optString("framed_100x128_1x") : null;
        if (optJSONObject == null || (optJSONObject2 = optJSONObject.optJSONObject("research")) == null) {
            newsfeedResearch = null;
        } else {
            Serializer.c<NewsfeedResearch> cVar = NewsfeedResearch.CREATOR;
            newsfeedResearch = NewsfeedResearch.a.a(optJSONObject2);
        }
        return new DzenArticle(str9, str10, str11, str12, str13, z4, num2, V, optString6, optString7, optString8, optString9, newsfeedResearch);
    }

    /* compiled from: DzenArticleInteractor.kt */
    public static final class a<Result> implements k7r0 {
        public static final a<Result> b = new a<>();

        @Override // xsna.k7r0
        public final per0 e(qrj0 qrj0Var, qrj0 qrj0Var2) {
            return k7r0.a.a(this, qrj0Var2);
        }

        @Override // xsna.k7r0
        public final Object a(JSONObject jSONObject) {
            return jSONObject;
        }
    }

    /* compiled from: DzenArticleInteractor.kt */
    public static final class b<Result> implements k7r0 {
        public static final b<Result> b = new b<>();

        @Override // xsna.k7r0
        public final per0 e(qrj0 qrj0Var, qrj0 qrj0Var2) {
            return k7r0.a.a(this, qrj0Var2);
        }

        @Override // xsna.k7r0
        public final Object a(JSONObject jSONObject) {
            return jSONObject;
        }
    }
}
